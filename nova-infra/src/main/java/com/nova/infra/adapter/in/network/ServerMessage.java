package com.nova.infra.adapter.in.network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

/**
 * Represents an outgoing server packet.
 * Contains the packet header (ID) and provides methods to build the message body.
 */
public class ServerMessage {

    private final short headerId;
    private final ByteBuf body;

    public ServerMessage(short headerId) {
        this.headerId = headerId;
        this.body = Unpooled.buffer();
    }

    public ServerMessage(int headerId) {
        this((short) headerId);
    }

    public short getHeaderId() {
        return headerId;
    }

    public ByteBuf getBody() {
        return body;
    }

    public ServerMessage appendInt(int value) {
        body.writeInt(value);
        return this;
    }

    public ServerMessage appendShort(int value) {
        body.writeShort(value);
        return this;
    }

    public ServerMessage appendBoolean(boolean value) {
        body.writeByte(value ? 1 : 0);
        return this;
    }

    public ServerMessage appendString(String value) {
        byte[] data = value.getBytes(StandardCharsets.UTF_8);
        body.writeShort(data.length);
        body.writeBytes(data);
        return this;
    }

    public ServerMessage appendBytes(byte[] data) {
        body.writeBytes(data);
        return this;
    }

    @Override
    public String toString() {
        return "ServerMessage{headerId=" + headerId + ", bodyLength=" + body.readableBytes() + "}";
    }
}