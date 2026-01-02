package com.nova.app.config;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.nova.core.domain.port.out.SessionRepository;
import com.nova.core.domain.port.out.UserRepository;
import com.nova.infra.adapter.in.network.packets.PacketDispatcher;
import com.nova.infra.adapter.in.network.packets.annotations.PacketScanner;
import com.nova.infra.adapter.in.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.in.network.packets.handlers.PacketHandlerManager;
import com.nova.infra.adapter.in.network.packets.parsers.PacketParserManager;
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
 * Configures infrastructure components (database, network, packet system).
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

    // === Packet System ===

    @Provides
    @Singleton
    public PacketParserManager provideParserManager() {
        PacketParserManager manager = new PacketParserManager();

        // Auto-discover and register all @ParsesPacket annotated parsers
        PacketScanner.registerParsers(manager);

        return manager;
    }

    @Provides
    @Singleton
    public PacketComposerManager provideComposerManager() {
        PacketComposerManager manager = new PacketComposerManager();

        // Auto-discover and register all @ComposesPacket annotated composers
        PacketScanner.registerComposers(manager);

        return manager;
    }

    @Provides
    @Singleton
    public PacketHandlerManager provideHandlerManager(Injector injector) {
        PacketHandlerManager manager = new PacketHandlerManager();

        // Auto-discover and register all @HandlesPacket annotated handlers
        // Handlers are instantiated via Guice for dependency injection
        PacketScanner.registerHandlers(manager, injector);

        return manager;
    }

    @Provides
    @Singleton
    public PacketDispatcher providePacketDispatcher(
            PacketParserManager parserManager,
            PacketHandlerManager handlerManager,
            PacketComposerManager composerManager) {
        return new PacketDispatcher(parserManager, handlerManager, composerManager);
    }

    // === Network Servers ===

    @Provides
    @Singleton
    public GameServer provideGameServer(PacketDispatcher packetDispatcher) {
        GameChannelInitializer initializer = new GameChannelInitializer(packetDispatcher);

        return new GameServer(GAME_HOST, GAME_PORT, initializer);
    }

    @Provides
    @Singleton
    public WebSocketGameServer provideWebSocketGameServer(PacketDispatcher packetDispatcher) {
        WebSocketChannelInitializer initializer = new WebSocketChannelInitializer(packetDispatcher);

        return new WebSocketGameServer(GAME_HOST, WEBSOCKET_PORT, initializer);
    }
}
