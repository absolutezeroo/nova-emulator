package com.nova.infra.adapter.in.network.handler.packet;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;

/**
 * Functional interface for handling incoming client packets.
 * <p>
 * Each implementation handles a specific packet type (identified by Header ID).
 * Handlers are responsible for:
 * - Deserializing the binary packet into domain commands
 * - Invoking the appropriate Use Case
 * - Sending responses back to the client
 * <p>
 * This interface bridges the Infrastructure layer (Netty packets) to the
 * Domain layer (Use Cases) following the Hexagonal Architecture pattern.
 */
@FunctionalInterface
public interface PacketHandler {

    /**
     * Handles an incoming packet from a client.
     *
     * @param connection the client connection (abstracted, domain-level)
     * @param message    the raw packet data from the client
     */
    void handle(NetworkConnection connection, ClientMessage message);
}
