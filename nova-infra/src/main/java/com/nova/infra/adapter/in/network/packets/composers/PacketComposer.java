package com.nova.infra.adapter.in.network.packets.composers;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;

/**
 * Abstract base class for packet composers.
 * Serializes typed message objects into PacketBuffer for sending to the client.
 *
 * @param <T> The type of outgoing packet this composer handles
 */
public abstract class PacketComposer<T extends IOutgoingPacket> {

    /**
     * Returns the packet ID (header) for this composer.
     *
     * @return The packet header ID
     */
    public abstract int getPacketId();

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
