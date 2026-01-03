package com.nova.core.domain.gateway;

/**
 * Output port for the game server infrastructure.
 * <p>
 * This interface abstracts the network server implementation,
 * allowing the domain to control server lifecycle without
 * depending on Netty or any specific networking library.
 */
public interface GameServerPort {

    /**
     * Starts the server and begins accepting connections.
     *
     * @throws Exception if the server fails to start (port in use, etc.)
     */
    void start() throws Exception;

    /**
     * Gracefully stops the server, closing all active connections.
     */
    void stop();

    /**
     * Checks if the server is currently accepting connections.
     */
    boolean isRunning();

    /**
     * Returns the port number the server is listening on.
     */
    int getPort();

    /**
     * Returns the server type identifier (e.g., "TCP", "WebSocket").
     */
    String getType();
}
