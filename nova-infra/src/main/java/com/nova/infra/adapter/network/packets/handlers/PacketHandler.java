package com.nova.infra.adapter.network.packets.handlers;

import com.nova.core.domain.gateway.NetworkConnection;
import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Interface for handling parsed incoming packets.
 * <p>
 * Handlers contain the business logic for processing client requests.
 * They bridge the infrastructure layer to the domain layer by:
 * <ol>
 *   <li>Receiving typed packet events from parsers</li>
 *   <li>Translating them to domain commands</li>
 *   <li>Invoking domain use cases</li>
 *   <li>Sending response messages to the client</li>
 * </ol>
 * <p>
 * Following Hexagonal Architecture, handlers are the only place
 * that knows about both packet events (infra) and use cases (domain).
 *
 * @param <T> the type of incoming packet event this handler processes
 */
public interface PacketHandler<T extends IncomingPacket> {

    /**
     * Handles an incoming packet event.
     *
     * @param connection the client connection
     * @param packet     the parsed packet event
     */
    void handle(NetworkConnection connection, T packet);
}
