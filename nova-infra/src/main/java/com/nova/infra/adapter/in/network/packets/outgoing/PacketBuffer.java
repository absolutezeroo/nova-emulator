package com.nova.infra.adapter.in.network.packets.outgoing;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Buffer for composing outgoing server packets.
 * <p>
 * This is a low-level buffer that provides methods to append various data types.
 * The caller manages the packet structure (length header, packet ID).
 * <p>
 * Typical usage:
 * <pre>
 * PacketBuffer buffer = new PacketBuffer();
 * buffer.appendInt(0); // Length placeholder
 * buffer.appendShort(packetId); // Packet ID
 * buffer.appendString("data"); // Body data
 * buffer.updateHeaderLength(); // Update length at position 0
 * channel.writeAndFlush(buffer.getBuffer());
 * </pre>
 */
public class PacketBuffer {

    private final ByteBuf buffer;
    private final ByteBufOutputStream stream;

    /**
     * Creates a new empty packet buffer.
     */
    public PacketBuffer() {
        this.buffer = Unpooled.buffer();
        this.stream = new ByteBufOutputStream(buffer);
    }

    /**
     * Appends a boolean value (1 byte).
     */
    public PacketBuffer appendBoolean(boolean value) {
        try {
            stream.writeBoolean(value);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write boolean", e);
        }
        return this;
    }

    /**
     * Appends a byte.
     */
    public PacketBuffer appendByte(int value) {
        try {
            stream.writeByte(value);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write byte", e);
        }
        return this;
    }

    /**
     * Appends a short (2 bytes, big-endian).
     */
    public PacketBuffer appendShort(int value) {
        try {
            stream.writeShort(value);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write short", e);
        }
        return this;
    }

    /**
     * Appends an integer (4 bytes, big-endian).
     */
    public PacketBuffer appendInt(int value) {
        try {
            stream.writeInt(value);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write int", e);
        }
        return this;
    }

    /**
     * Appends a long (8 bytes, big-endian).
     */
    public PacketBuffer appendLong(long value) {
        try {
            stream.writeLong(value);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write long", e);
        }
        return this;
    }

    /**
     * Appends a string (2-byte length prefix + bytes).
     */
    public PacketBuffer appendString(String value) {
        try {
            byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
            stream.writeShort(bytes.length);
            stream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write string", e);
        }
        return this;
    }

    /**
     * Appends a byte array.
     */
    public PacketBuffer appendBytes(byte[] data) {
        try {
            stream.write(data);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write bytes", e);
        }
        return this;
    }

    /**
     * Updates the length field at position 0.
     * <p>
     * Call this after all data has been written.
     * Sets position 0 to (total size - 4).
     */
    public void updateHeaderLength() {
        buffer.setInt(0, buffer.writerIndex() - 4);
    }

    /**
     * Gets the underlying ByteBuf for transmission.
     */
    public ByteBuf getBuffer() {
        return buffer;
    }

    /**
     * Converts the buffer to a byte array.
     */
    public byte[] toByteArray() {
        return buffer.copy().array();
    }

    /**
     * Gets the current writer index (total bytes written).
     */
    public int writerIndex() {
        return buffer.writerIndex();
    }

    /**
     * Releases the underlying buffer.
     */
    public void release() {
        buffer.release();
    }
}
