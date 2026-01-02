package com.nova.infra.adapter.in.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Encodes ServerMessage objects into bytes for transmission to the client.
 * <p>
 * Output packet structure:
 * - 4 bytes: Length (total size of header and body)
 * - 2 bytes: Header ID (packet type identifier)
 * - N bytes: Packet body
 */
public class GamePacketEncoder extends MessageToByteEncoder<ServerMessage> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GamePacketEncoder.class);

    @Override
    protected void encode(ChannelHandlerContext ctx, ServerMessage msg, ByteBuf out) throws Exception {
        ByteBuf body = msg.getBody();
        int bodyLength = body.readableBytes();

        // Write length (header ID size + body size)
        out.writeInt(2 + bodyLength);

        // Write header ID
        out.writeShort(msg.getHeaderId());

        // Write body
        out.writeBytes(body);

        LOGGER.debug("Encoded packet: headerId={}, bodyLength={}", msg.getHeaderId(), bodyLength);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error("Error encoding packet for {}: {}", ctx.channel().remoteAddress(), cause.getMessage());
        ctx.close();
    }
}