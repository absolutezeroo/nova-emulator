package com.nova.app.config;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.nova.core.domain.api.room.RoomTaskScheduler;
import com.nova.core.domain.repository.SessionRepository;
import com.nova.core.domain.repository.UserRepository;
import com.nova.infra.adapter.concurrency.StripedRoomTaskScheduler;
import com.nova.infra.adapter.network.packets.PacketDispatcher;
import com.nova.infra.adapter.network.packets.annotations.PacketScanner;
import com.nova.infra.adapter.network.packets.composers.PacketComposerManager;
import com.nova.infra.adapter.network.packets.handlers.PacketHandlerManager;
import com.nova.infra.adapter.network.packets.parsers.PacketParserManager;
import com.nova.infra.adapter.network.server.GameChannelInitializer;
import com.nova.infra.adapter.network.server.GameServer;
import com.nova.infra.adapter.network.websocket.WebSocketChannelInitializer;
import com.nova.infra.adapter.network.websocket.WebSocketGameServer;
import com.nova.infra.adapter.persistence.InMemorySessionRepository;
import com.nova.infra.adapter.persistence.repository.JdbiUserRepository;
import com.nova.infra.config.DatabaseConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

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
    private static final String DB_NAME = "nova_emulator";
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

    // === Database Layer ===

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
    public Jdbi provideJdbi(HikariDataSource dataSource) {
        Jdbi jdbi = Jdbi.create(dataSource);

        // Install SqlObject plugin for annotation-based DAOs
        jdbi.installPlugin(new SqlObjectPlugin());

        // Configure strict mode for better error messages
        jdbi.getConfig().get(org.jdbi.v3.core.statement.SqlStatements.class)
            .setUnusedBindingAllowed(false);

        return jdbi;
    }

    @Provides
    @Singleton
    public UserRepository provideUserRepository(Jdbi jdbi) {
        return new JdbiUserRepository(jdbi);
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

    // === Concurrency ===

    @Provides
    @Singleton
    public RoomTaskScheduler provideRoomTaskScheduler() {
        // Use CPU core count for optimal parallelism
        int stripeCount = Runtime.getRuntime().availableProcessors();
        return new StripedRoomTaskScheduler(stripeCount);
    }
}
