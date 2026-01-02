package com.nova.infra.adapter.in.network.handler.packet;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Central registry and router for packet handlers.
 * <p>
 * Maps packet Header IDs to their corresponding {@link PacketHandler} implementations.
 * When a packet arrives, the manager looks up the appropriate handler and delegates processing.
 * <p>
 * This class acts as the bridge between the raw Netty pipeline and the domain use cases,
 * ensuring clean separation of concerns in the Hexagonal Architecture.
 */
public class PacketManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketManager.class);

    private final Map<Integer, PacketHandler> handlers = new ConcurrentHashMap<>();

    public PacketManager() {
        LOGGER.info("PacketManager initialized");
    }

    /**
     * Registers a handler for a specific packet Header ID.
     *
     * @param headerId the packet Header ID to handle
     * @param handler  the handler implementation
     * @return this PacketManager for fluent chaining
     */
    public PacketManager register(int headerId, PacketHandler handler) {
        PacketHandler existing = handlers.put(headerId, handler);

        if (existing != null) {
            LOGGER.warn("Replaced existing handler for packet ID {}", headerId);
        } else {
            LOGGER.debug("Registered handler for packet ID {}", headerId);
        }

        return this;
    }

    /**
     * Registers multiple handlers at once.
     *
     * @param handlerMap map of Header ID to handler
     * @return this PacketManager for fluent chaining
     */
    public PacketManager registerAll(Map<Integer, PacketHandler> handlerMap) {
        handlerMap.forEach(this::register);
        return this;
    }

    /**
     * Routes an incoming packet to its registered handler.
     *
     * @param connection the client connection
     * @param message    the incoming packet
     * @return true if a handler was found and invoked, false otherwise
     */
    public boolean handle(NetworkConnection connection, ClientMessage message) {
        int headerId = message.getHeaderId();
        PacketHandler handler = handlers.get(headerId);

        if (handler == null) {
            LOGGER.warn("No handler registered for packet ID {} from {}", headerId, connection.getIpAddress());
            return false;
        }

        try {
            LOGGER.debug("Routing packet ID {} to handler", headerId);
            handler.handle(connection, message);
            return true;
        } catch (Exception e) {
            LOGGER.error("Error handling packet ID {} from {}: {}", headerId, connection.getIpAddress(), e.getMessage(), e);
            return false;
        }
    }

    /**
     * Gets the handler for a specific Header ID.
     *
     * @param headerId the packet Header ID
     * @return the handler, or empty if not registered
     */
    public Optional<PacketHandler> getHandler(int headerId) {
        return Optional.ofNullable(handlers.get(headerId));
    }

    /**
     * Checks if a handler is registered for the given Header ID.
     *
     * @param headerId the packet Header ID
     * @return true if a handler is registered
     */
    public boolean hasHandler(int headerId) {
        return handlers.containsKey(headerId);
    }

    /**
     * Gets all registered Header IDs.
     *
     * @return set of registered Header IDs
     */
    public Set<Integer> getRegisteredIds() {
        return Set.copyOf(handlers.keySet());
    }

    /**
     * Gets the count of registered handlers.
     *
     * @return number of registered handlers
     */
    public int getHandlerCount() {
        return handlers.size();
    }
}
