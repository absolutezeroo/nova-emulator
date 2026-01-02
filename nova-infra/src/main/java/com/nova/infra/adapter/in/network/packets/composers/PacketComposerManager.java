package com.nova.infra.adapter.in.network.packets.composers;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Registry and manager for packet composers.
 * <p>
 * Maps outgoing message types to their corresponding composers.
 * Handles the composition of typed messages into PacketBuffer packets.
 */
public class PacketComposerManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacketComposerManager.class);

    private final Map<Class<?>, PacketComposer<?>> composers = new ConcurrentHashMap<>();

    public PacketComposerManager() {
        LOGGER.info("PacketComposerManager initialized");
    }

    /**
     * Registers a composer for a specific message type.
     *
     * @param messageType the message class
     * @param composer    the composer for that message type
     * @return this manager for fluent chaining
     */
    public <T extends IOutgoingPacket> PacketComposerManager register(
            Class<T> messageType,
            PacketComposer<T> composer) {

        PacketComposer<?> existing = composers.put(messageType, composer);

        if (existing != null) {
            LOGGER.warn("Replaced existing composer for {}", messageType.getSimpleName());
        } else {
            LOGGER.debug("Registered composer for {}: packet ID {}",
                    messageType.getSimpleName(), composer.getPacketId());
        }

        return this;
    }

    /**
     * Composes a message into a PacketBuffer ready for sending.
     *
     * @param message the message to compose
     * @return the composed PacketBuffer
     * @throws IllegalArgumentException if no composer is registered for the message type
     */
    @SuppressWarnings("unchecked")
    public <T extends IOutgoingPacket> PacketBuffer compose(T message) {
        Class<?> messageType = message.getClass();
        PacketComposer<T> composer = (PacketComposer<T>) composers.get(messageType);

        if (composer == null) {
            throw new IllegalArgumentException(
                    "No composer registered for message type: " + messageType.getName());
        }

        PacketBuffer packet = composer.compose(message);

        LOGGER.debug("Composed {} (packet ID {}, {} bytes)",
                messageType.getSimpleName(), composer.getPacketId(), packet.readableBytes());

        return packet;
    }

    /**
     * Gets the composer for a specific message type.
     */
    @SuppressWarnings("unchecked")
    public <T extends IOutgoingPacket> Optional<PacketComposer<T>> getComposer(Class<T> messageType) {
        return Optional.ofNullable((PacketComposer<T>) composers.get(messageType));
    }

    /**
     * Checks if a composer is registered for the given message type.
     */
    public boolean hasComposer(Class<?> messageType) {
        return composers.containsKey(messageType);
    }

    /**
     * Gets the count of registered composers.
     */
    public int getComposerCount() {
        return composers.size();
    }
}
