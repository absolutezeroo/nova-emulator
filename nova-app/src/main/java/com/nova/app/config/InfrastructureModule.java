package com.nova.app.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.nova.core.domain.port.out.SessionRepository;
import com.nova.core.domain.port.out.UserRepository;
import com.nova.infra.adapter.in.network.GameServer;
import com.nova.infra.adapter.out.persistence.InMemorySessionRepository;
import com.nova.infra.adapter.out.persistence.MySqlUserRepository;
import com.nova.infra.config.DatabaseConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * Guice module for Infrastructure layer bindings.
 *
 * Binds output ports to their adapter implementations.
 * Configures infrastructure components (database, network).
 */
public class InfrastructureModule extends AbstractModule {

    // TODO: Load from config file
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 3306;
    private static final String DB_NAME = "nova";
    private static final String DB_USER = "nova";
    private static final String DB_PASS = "nova";
    private static final int DB_POOL_SIZE = 10;

    private static final String GAME_HOST = "0.0.0.0";
    private static final int GAME_PORT = 30000;

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

    @Provides
    @Singleton
    public GameServer provideGameServer() {
        // TODO: Create proper channel initializer with packet handlers
        ChannelInitializer<SocketChannel> initializer = new ChannelInitializer<>() {
            @Override
            protected void initChannel(SocketChannel ch) {
                // Pipeline will be configured here with:
                // - Frame decoder
                // - Packet decoder
                // - Message handlers
                // - Packet encoder
            }
        };

        return new GameServer(GAME_HOST, GAME_PORT, initializer);
    }
}
