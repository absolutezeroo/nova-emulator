package com.nova.infra.adapter.in.network.packets.composers;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;

/**
 * Abstract base class for composing outgoing packets.
 * <p>
 * Composers serialize typed message DTOs into PacketBuffer packets.
 * Each composer handles a specific message type and writes the
 * appropriate binary data according to the Habbo protocol.
 *
 * @param <T> the type of outgoing message this composer handles
 */
public abstract class PacketComposer<T extends IOutgoingPacket> {

    /**
     * Gets the packet ID for this message type.
     *
     * @return the outgoing packet header ID
     */
    public abstract int getPacketId();

    /**
     * Composes the message into a PacketBuffer ready for transmission.
     * <p>
     * Builds the complete packet structure:
     * <pre>
     * [4 bytes: length] [2 bytes: packet ID] [N bytes: body]
     * </pre>
     *
     * @param message the message DTO to compose
     * @return the composed PacketBuffer ready for sending
     */
    public PacketBuffer compose(T message) {
        PacketBuffer packet = new PacketBuffer();

        // Write length placeholder (4 bytes)
        packet.appendInt(0);

        // Write packet ID (2 bytes)
        packet.appendShort(getPacketId());

        // Write message body
        write(packet, message);

        // Update length header
        packet.updateHeaderLength();

        return packet;
    }

    /**
     * Writes the message body data to the packet buffer.
     * <p>
     * Subclasses implement this to write their specific data format.
     * The header (length + packet ID) is already written.
     *
     * @param packet  the packet buffer to write to
     * @param message the message DTO containing the data
     */
    protected abstract void write(PacketBuffer packet, T message);
}
