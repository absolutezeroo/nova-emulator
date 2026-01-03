package com.nova.infra.adapter.network.packets.outgoing;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Low-level buffer for packet serialization using Netty's ByteBuf.
 * Handles the Habbo protocol format: [4 bytes length][2 bytes header][N bytes body]
 */
public class PacketBuffer {

    private final ByteBuf buffer;
    private final ByteBufOutputStream outputStream;

    public PacketBuffer() {
        this.buffer = Unpooled.buffer();
        this.outputStream = new ByteBufOutputStream(buffer);
    }

    public void appendInt(int value) {
        buffer.writeInt(value);
    }

    public void appendShort(int value) {
        buffer.writeShort(value);
    }

    public void appendByte(int value) {
        buffer.writeByte(value);
    }

    public void appendBoolean(boolean value) {
        buffer.writeByte(value ? 1 : 0);
    }

    public void appendString(String value) {
        if (value == null) {
            value = "";
        }
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        buffer.writeShort(bytes.length);
        buffer.writeBytes(bytes);
    }

    public void appendDouble(double value) {
        appendString(String.valueOf(value));
    }

    public void appendFloat(float value) {
        appendString(String.valueOf(value));
    }

    /**
     * Updates the length field at the beginning of the packet.
     * The length excludes the 4-byte length field itself.
     */
    public void updateHeaderLength() {
        int length = buffer.writerIndex() - 4;
        buffer.setInt(0, length);
    }

    public ByteBuf getBuffer() {
        return buffer;
    }

    public int getLength() {
        return buffer.writerIndex();
    }
}
