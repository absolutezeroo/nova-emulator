package com.nova.core.domain.port.out.network;

/**
 * Represents an abstract network connection to a client.
 * <p>
 * This is an output port that hides the underlying network implementation
 * (Netty, raw sockets, etc.) from the domain layer. The infrastructure
 * layer provides concrete implementations.
 * <p>
 * The domain uses this interface to:
 * - Send responses to the client (protocol-agnostic)
 * - Disconnect misbehaving clients
 * - Identify clients by IP for logging/banning
 */
public interface NetworkConnection {

    /**
     * Unique identifier for this connection.
     * Used to track sessions and route messages.
     */
    String getId();

    /**
     * Returns the client's IP address.
     * Used for logging, rate limiting, and ban checks.
     */
    String getIpAddress();

    /**
     * Sends a response to the client.
     * The infrastructure layer handles serialization to the wire protocol.
     *
     * @param response a protocol-agnostic response object (defined in core)
     */
    void send(Object response);

    /**
     * Forcefully closes the connection.
     * Used when kicking users or handling protocol violations.
     */
    void disconnect();

    /**
     * Checks if the connection is still active.
     */
    boolean isConnected();

    /**
     * Attaches arbitrary data to this connection (e.g., authenticated User).
     * Allows the domain to associate state with a connection.
     */
    void setAttribute(String key, Object value);

    /**
     * Retrieves attached data.
     */
    <T> T getAttribute(String key, Class<T> type);
}
