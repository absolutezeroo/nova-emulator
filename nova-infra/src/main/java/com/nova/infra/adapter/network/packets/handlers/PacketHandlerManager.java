package com.nova.infra.adapter.network.packets.handlers;

import com.nova.core.domain.gateway.NetworkConnection;
import com.nova.infra.adapter.network.packets.IncomingPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Registry and manager for packet handlers.
 * <p>
 * Maps incoming packet event types to their corresponding handlers.
 * Responsible for dispatching parsed packets to the correct handler.
 */
public class PacketHandlerManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketHandlerManager.class);

    private final Map<Class<?>, PacketHandler<?>> handlers = new ConcurrentHashMap<>();

    public PacketHandlerManager() {
        LOGGER.info("PacketHandlerManager initialized");
    }

    /**
     * Registers a handler for a specific packet event type.
     *
     * @param packetType the packet event class
     * @param handler    the handler for that packet type
     * @return this manager for fluent chaining
     */
    public <T extends IncomingPacket> PacketHandlerManager register(
            Class<T> packetType,
            PacketHandler<T> handler) {

        PacketHandler<?> existing = handlers.put(packetType, handler);

        if (existing != null) {
            LOGGER.warn("Replaced existing handler for {}", packetType.getSimpleName());
        } else {
            LOGGER.debug("Registered handler for {}: {}",
                    packetType.getSimpleName(), handler.getClass().getSimpleName());
        }

        return this;
    }

    /**
     * Handles a parsed packet event.
     *
     * @param connection the client connection
     * @param packet     the parsed packet event
     * @return true if a handler was found and invoked, false otherwise
     */
    @SuppressWarnings("unchecked")
    public boolean handle(NetworkConnection connection, IncomingPacket packet) {
        Class<?> packetType = packet.getClass();
        PacketHandler<IncomingPacket> handler =
                (PacketHandler<IncomingPacket>) handlers.get(packetType);

        if (handler == null) {
            LOGGER.warn("No handler registered for packet type: {}", packetType.getSimpleName());

            return false;
        }

        try {
            LOGGER.debug("Dispatching {} to {}", packetType.getSimpleName(), handler.getClass().getSimpleName());

            handler.handle(connection, packet);

            return true;
        } catch (Exception e) {
            LOGGER.error("Error handling packet {}: {}", packetType.getSimpleName(), e.getMessage(), e);

            return false;
        }
    }

    /**
     * Gets the handler for a specific packet type.
     */
    @SuppressWarnings("unchecked")
    public <T extends IncomingPacket> Optional<PacketHandler<T>> getHandler(Class<T> packetType) {
        return Optional.ofNullable((PacketHandler<T>) handlers.get(packetType));
    }

    /**
     * Checks if a handler is registered for the given packet type.
     */
    public boolean hasHandler(Class<?> packetType) {
        return handlers.containsKey(packetType);
    }

    /**
     * Gets the count of registered handlers.
     */
    public int getHandlerCount() {
        return handlers.size();
    }
}
