package com.nova.infra.adapter.in.network.handler;

import com.nova.infra.adapter.in.network.codec.ClientMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Final handler in the Netty pipeline that processes decoded ClientMessage packets.
 * <p>
 * This handler receives fully decoded packets and routes them to the appropriate
 * packet handlers based on the header ID.
 */
public class GameHandler extends SimpleChannelInboundHandler<ClientMessage> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        LOGGER.info("Client connected: {}", ctx.channel().remoteAddress());

        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        LOGGER.info("Client disconnected: {}", ctx.channel().remoteAddress());

        super.channelInactive(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ClientMessage msg) throws Exception {
        LOGGER.debug("Received packet from {}: headerId={}", ctx.channel().remoteAddress(), msg.getHeaderId());

        // TODO: Route packet to appropriate handler based on headerId
        // Example: packetManager.handle(ctx.channel(), msg);

        // Release the message body buffer
        msg.release();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error("Error handling packet from {}: {}", ctx.channel().remoteAddress(), cause.getMessage(), cause);

        ctx.close();
    }
}
