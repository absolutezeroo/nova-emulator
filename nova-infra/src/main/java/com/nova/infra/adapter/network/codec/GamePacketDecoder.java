package com.nova.infra.adapter.network.codec;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Decodes framed byte data into ClientMessage objects.
 * <p>
 * This handler receives data after the length field has been stripped by
 * GameByteFrameDecoder. The remaining data structure is:
 * - 2 bytes: Header ID (packet type identifier)
 * - N bytes: Packet body
 * <p>
 * Each decoded packet is wrapped in a ClientMessage object and passed
 * to the next handler in the pipeline.
 */
public class GamePacketDecoder extends ByteToMessageDecoder {

    private static final Logger LOGGER = LoggerFactory.getLogger(GamePacketDecoder.class);

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if (in.readableBytes() < 2) {
            return;
        }

        short headerId = in.readShort();
        ByteBuf body = Unpooled.copiedBuffer(in.readBytes(in.readableBytes()));

        ClientMessage message = new ClientMessage(headerId, body);

        LOGGER.debug("Decoded packet: headerId={}, bodyLength={}", headerId, body.readableBytes());

        out.add(message);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error("Error decoding packet from {}: {}", ctx.channel().remoteAddress(), cause.getMessage());
        ctx.close();
    }
}
