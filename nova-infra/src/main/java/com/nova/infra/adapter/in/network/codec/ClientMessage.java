package com.nova.infra.adapter.in.network.codec;

import io.netty.buffer.ByteBuf;

import java.nio.charset.StandardCharsets;

/**
 * Represents a decoded client packet.
 * Contains the packet header (ID) and the message body.
 */
public class ClientMessage {

    private final short headerId;
    private final ByteBuf body;

    public ClientMessage(short headerId, ByteBuf body) {
        this.headerId = headerId;
        this.body = body;
    }

    public short getHeaderId() {
        return headerId;
    }

    public ByteBuf getBody() {
        return body;
    }

    public int readInt() {
        return body.readInt();
    }

    public short readShort() {
        return body.readShort();
    }

    public boolean readBoolean() {
        return body.readByte() == 1;
    }

    public String readString() {
        int length = body.readShort();
        byte[] data = new byte[length];

        body.readBytes(data);

        return new String(data, StandardCharsets.UTF_8);
    }

    public int readableBytes() {
        return body.readableBytes();
    }

    public void release() {
        if (body != null && body.refCnt() > 0) {
            body.release();
        }
    }

    @Override
    public String toString() {
        return "ClientMessage{headerId=" + headerId + ", bodyLength=" + body.readableBytes() + "}";
    }
}
