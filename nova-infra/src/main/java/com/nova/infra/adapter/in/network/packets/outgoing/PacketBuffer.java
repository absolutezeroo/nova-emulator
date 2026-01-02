package com.nova.infra.adapter.in.network.packets.outgoing;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

/**
 * Buffer for composing outgoing server packets.
 * <p>
 * Complete packet structure (Habbo protocol):
 * <pre>
 * [4 bytes: length] [2 bytes: header ID] [N bytes: body]
 * </pre>
 * <p>
 * The buffer is self-contained: call {@link #finalize()} after writing
 * all data to update the length header, then use {@link #getBuffer()}
 * to get the complete packet ready for transmission.
 */
public class PacketBuffer {

    private final ByteBuf buffer;
    private final int headerId;

    /**
     * Creates a new packet buffer with the specified header ID.
     * <p>
     * Initializes the buffer with:
     * - 4-byte length placeholder (to be updated via finalize())
     * - 2-byte header ID
     *
     * @param headerId the packet header ID
     */
    public PacketBuffer(int headerId) {
        this.headerId = headerId;
        this.buffer = Unpooled.buffer();

        // Write length placeholder (4 bytes) - will be updated in finalize()
        buffer.writeInt(0);

        // Write header ID (2 bytes)
        buffer.writeShort(headerId);
    }

    /**
     * Gets the packet header ID.
     */
    public int getHeaderId() {
        return headerId;
    }

    /**
     * Appends an integer (4 bytes, big-endian).
     */
    public PacketBuffer appendInt(int value) {
        buffer.writeInt(value);
        return this;
    }

    /**
     * Appends a short (2 bytes, big-endian).
     */
    public PacketBuffer appendShort(int value) {
        buffer.writeShort(value);
        return this;
    }

    /**
     * Appends a byte.
     */
    public PacketBuffer appendByte(int value) {
        buffer.writeByte(value);
        return this;
    }

    /**
     * Appends a boolean (1 byte: 0 or 1).
     */
    public PacketBuffer appendBoolean(boolean value) {
        buffer.writeByte(value ? 1 : 0);
        return this;
    }

    /**
     * Appends a string (2-byte length prefix + UTF-8 bytes).
     */
    public PacketBuffer appendString(String value) {
        byte[] data = value.getBytes(StandardCharsets.UTF_8);
        buffer.writeShort(data.length);
        buffer.writeBytes(data);
        return this;
    }

    /**
     * Appends raw bytes.
     */
    public PacketBuffer appendBytes(byte[] data) {
        buffer.writeBytes(data);
        return this;
    }

    /**
     * Appends a long (8 bytes, big-endian).
     */
    public PacketBuffer appendLong(long value) {
        buffer.writeLong(value);
        return this;
    }

    /**
     * Finalizes the packet by updating the length header.
     * <p>
     * Must be called after all data has been written.
     * Length = total size - 4 (length field itself is not counted).
     *
     * @return this buffer for chaining
     */
    public PacketBuffer finalize() {
        // Length = total bytes written - 4 bytes (length field)
        buffer.setInt(0, buffer.writerIndex() - 4);
        return this;
    }

    /**
     * Gets the underlying ByteBuf ready for transmission.
     * <p>
     * Call {@link #finalize()} before this to ensure the length header is set.
     */
    public ByteBuf getBuffer() {
        return buffer;
    }

    /**
     * Gets the total size of the packet (including headers).
     */
    public int size() {
        return buffer.writerIndex();
    }

    /**
     * Gets the body size (excluding 4-byte length and 2-byte header ID).
     */
    public int bodySize() {
        return buffer.writerIndex() - 6;
    }

    /**
     * Converts the packet to a byte array.
     */
    public byte[] toByteArray() {
        byte[] bytes = new byte[buffer.readableBytes()];
        buffer.getBytes(buffer.readerIndex(), bytes);
        return bytes;
    }

    /**
     * Releases the underlying buffer.
     */
    public void release() {
        buffer.release();
    }

    @Override
    public String toString() {
        return "PacketBuffer{headerId=" + headerId + ", bodySize=" + bodySize() + "}";
    }
}
