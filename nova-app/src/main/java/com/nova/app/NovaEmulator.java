package com.nova.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.nova.app.config.CoreModule;
import com.nova.app.config.InfrastructureModule;
import com.nova.infra.adapter.in.network.GameServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * NovaEmulator - Main Application Entry Point
 *
 * This is the composition root where all dependencies are wired together
 * using the Hexagonal Architecture pattern.
 */
public class NovaEmulator {

    private static final Logger LOGGER = LoggerFactory.getLogger(NovaEmulator.class);

    public static final String VERSION = "1.0.0-SNAPSHOT";
    public static final String NAME = "NovaEmulator";

    private final Injector injector;
    private GameServer gameServer;

    public NovaEmulator() {
        LOGGER.info("Initializing {} v{}", NAME, VERSION);

        // Create the dependency injection container
        this.injector = Guice.createInjector(
                new CoreModule(),
                new InfrastructureModule()
        );
    }

    public void start() {
        LOGGER.info("Starting {}...", NAME);

        try {
            // Get the game server from DI container
            gameServer = injector.getInstance(GameServer.class);
            gameServer.start();

            // Add shutdown hook
            Runtime.getRuntime().addShutdownHook(new Thread(this::stop));

            LOGGER.info("{} v{} started successfully!", NAME, VERSION);

        } catch (Exception e) {
            LOGGER.error("Failed to start {}", NAME, e);
            System.exit(1);
        }
    }

    public void stop() {
        LOGGER.info("Shutting down {}...", NAME);

        if (gameServer != null) {
            gameServer.stop();
        }

        LOGGER.info("{} stopped.", NAME);
    }

    public static void main(String[] args) {
        printBanner();

        NovaEmulator emulator = new NovaEmulator();
        emulator.start();
    }

    private static void printBanner() {
        System.out.println("""

             _   _                   ______                 _       _
            | \\ | |                 |  ____|               | |     | |
            |  \\| | _____   ____ _  | |__   _ __ ___  _   _| | __ _| |_ ___  _ __
            | . ` |/ _ \\ \\ / / _` | |  __| | '_ ` _ \\| | | | |/ _` | __/ _ \\| '__|
            | |\\  | (_) \\ V / (_| | | |____| | | | | | |_| | | (_| | || (_) | |
            |_| \\_|\\___/ \\_/ \\__,_| |______|_| |_| |_|\\__,_|_|\\__,_|\\__\\___/|_|

                              Hexagonal Architecture Edition
                                      Version """ + VERSION + """

            """);
    }
}
