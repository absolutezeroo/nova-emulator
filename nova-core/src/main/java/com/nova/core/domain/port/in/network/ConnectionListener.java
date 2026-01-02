package com.nova.core.domain.port.in.network;

import com.nova.core.domain.port.out.network.NetworkConnection;

/**
 * Input port for handling network connection events.
 * <p>
 * The infrastructure layer calls these methods when network events occur.
 * This is the entry point for the domain to react to client connections.
 */
public interface ConnectionListener {

    /**
     * Called when a new client connection is established.
     *
     * @param connection the abstracted network connection
     */
    void onConnect(NetworkConnection connection);

    /**
     * Called when a client disconnects (gracefully or due to error).
     *
     * @param connection the connection that was closed
     */
    void onDisconnect(NetworkConnection connection);

    /**
     * Called when a decoded command is received from a client.
     * The infrastructure has already converted the binary packet
     * into a domain command object.
     *
     * @param connection the source connection
     * @param command    the decoded command (DTO from core)
     */
    void onCommand(NetworkConnection connection, Object command);

    /**
     * Called when a protocol error occurs (malformed packet, etc.).
     *
     * @param connection the connection that caused the error
     * @param error      description of the error
     */
    void onError(NetworkConnection connection, String error);
}
