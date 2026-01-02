package com.nova.infra.adapter.in.network.packets.composers;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;

/**
 * Abstract base class for packet composers.
 * Serializes typed message objects into PacketBuffer for sending to the client.
 * <p>
 * Composers should be annotated with {@link ComposesPacket} to specify their header ID:
 * <pre>
 * {@code
 * @ComposesPacket(Outgoing.AUTHENTICATED)
 * public class AuthenticatedComposer extends PacketComposer<AuthenticatedMessage> {
 *     @Override
 *     protected void write(PacketBuffer packet, AuthenticatedMessage message) {
 *         // No fields to write
 *     }
 * }
 * }
 * </pre>
 *
 * @param <T> The type of outgoing packet this composer handles
 */
public abstract class PacketComposer<T extends IOutgoingPacket> {

    private final int packetId;

    /**
     * Creates a composer, reading the packet ID from the {@link ComposesPacket} annotation.
     *
     * @throws IllegalStateException if the annotation is missing
     */
    protected PacketComposer() {
        ComposesPacket annotation = this.getClass().getAnnotation(ComposesPacket.class);
        if (annotation != null) {
            this.packetId = annotation.value();
        } else {
            // Fallback for backwards compatibility during migration
            this.packetId = getPacketIdLegacy();
        }
    }

    /**
     * Returns the packet ID (header) for this composer.
     *
     * @return The packet header ID
     */
    public final int getPacketId() {
        return packetId;
    }

    /**
     * Legacy method for backwards compatibility.
     * Override this if not using the {@link ComposesPacket} annotation.
     *
     * @return The packet header ID
     * @deprecated Use {@link ComposesPacket} annotation instead
     */
    @Deprecated
    protected int getPacketIdLegacy() {
        throw new IllegalStateException(
                "Composer " + getClass().getName() + " must be annotated with @ComposesPacket");
    }

    /**
     * Writes the message content to the packet buffer.
     * Subclasses implement this to serialize their specific message type.
     *
     * @param packet  The buffer to write to
     * @param message The message to serialize
     */
    protected abstract void write(PacketBuffer packet, T message);

    /**
     * Composes a complete packet from the message.
     * Handles the packet structure: [length][header][body]
     *
     * @param message The message to compose
     * @return The composed packet buffer ready for sending
     */
    public PacketBuffer compose(T message) {
        PacketBuffer packet = new PacketBuffer();
        packet.appendInt(0);              // Length placeholder
        packet.appendShort(getPacketId()); // Header ID
        write(packet, message);           // Body
        packet.updateHeaderLength();      // Finalize length
        return packet;
    }
}
