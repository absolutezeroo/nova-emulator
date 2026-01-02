package com.nova.app.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.nova.core.domain.port.in.UserUseCase;
import com.nova.core.domain.port.out.SessionRepository;
import com.nova.core.domain.port.out.UserRepository;
import com.nova.infra.adapter.in.network.codec.MessageEncoder;
import com.nova.infra.adapter.in.network.codec.PassthroughMessageEncoder;
import com.nova.infra.adapter.in.network.handler.packet.Incoming;
import com.nova.infra.adapter.in.network.handler.packet.PacketManager;
import com.nova.infra.adapter.in.network.handler.packet.handlers.SsoLoginHandler;
import com.nova.infra.adapter.in.network.server.GameChannelInitializer;
import com.nova.infra.adapter.in.network.server.GameServer;
import com.nova.infra.adapter.in.network.websocket.WebSocketChannelInitializer;
import com.nova.infra.adapter.in.network.websocket.WebSocketGameServer;
import com.nova.infra.adapter.out.persistence.InMemorySessionRepository;
import com.nova.infra.adapter.out.persistence.MySqlUserRepository;
import com.nova.infra.config.DatabaseConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * Guice module for Infrastructure layer bindings.
 * <p>
 * Binds output ports to their adapter implementations.
 * Configures infrastructure components (database, network, packet routing).
 */
public class InfrastructureModule extends AbstractModule {

    // TODO: Load from config file
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 3306;
    private static final String DB_NAME = "veloce_fusion_api";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "admin";
    private static final int DB_POOL_SIZE = 10;

    private static final String GAME_HOST = "0.0.0.0";
    private static final int GAME_PORT = 30000;
    private static final int WEBSOCKET_PORT = 2096;

    @Override
    protected void configure() {
        // Bind Output Ports to Adapter implementations
        bind(SessionRepository.class).to(InMemorySessionRepository.class).in(Singleton.class);

        // Bind MessageEncoder
        bind(MessageEncoder.class).to(PassthroughMessageEncoder.class).in(Singleton.class);
    }

    @Provides
    @Singleton
    public HikariDataSource provideDataSource() {
        DatabaseConfig config = new DatabaseConfig(
                DB_HOST, DB_PORT, DB_NAME, DB_USER, DB_PASS, DB_POOL_SIZE
        );
        return config.createDataSource();
    }

    @Provides
    @Singleton
    public UserRepository provideUserRepository(HikariDataSource dataSource) {
        return new MySqlUserRepository(dataSource);
    }

    @Provides
    @Singleton
    public PacketManager providePacketManager(UserUseCase userUseCase) {
        PacketManager packetManager = new PacketManager();

        // Register packet handlers
        packetManager.register(Incoming.SSO_TICKET, new SsoLoginHandler(userUseCase));

        return packetManager;
    }

    @Provides
    @Singleton
    public GameServer provideGameServer(PacketManager packetManager, MessageEncoder messageEncoder) {
        GameChannelInitializer initializer = new GameChannelInitializer(packetManager, messageEncoder);
        return new GameServer(GAME_HOST, GAME_PORT, initializer);
    }

    @Provides
    @Singleton
    public WebSocketGameServer provideWebSocketGameServer(PacketManager packetManager, MessageEncoder messageEncoder) {
        WebSocketChannelInitializer initializer = new WebSocketChannelInitializer(packetManager, messageEncoder);
        return new WebSocketGameServer(GAME_HOST, WEBSOCKET_PORT, initializer);
    }
}
