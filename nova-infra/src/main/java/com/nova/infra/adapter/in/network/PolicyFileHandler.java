package com.nova.infra.adapter.in.network;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Handles Flash/Nitro cross-domain policy file requests.
 * <p>
 * When a client connects, the first request may be a policy file request
 * starting with '&lt;' (e.g., "&lt;policy-file-request/&gt;"). This handler:
 * - Detects if the first byte is '&lt;'
 * - If so, responds with the cross-domain policy XML and closes the connection
 * - If not, removes itself from the pipeline and lets other handlers process the data
 */
public class PolicyFileHandler extends ByteToMessageDecoder {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyFileHandler.class);

    private static final String CROSS_DOMAIN_POLICY = "<?xml version=\"1.0\"?>\n" +
            "<!DOCTYPE cross-domain-policy SYSTEM \"/xml/dtds/cross-domain-policy.dtd\">\n" +
            "<cross-domain-policy>\n" +
            "<allow-access-from domain=\"*\" to-ports=\"1-31111\" />\n" +
            "</cross-domain-policy>" + (char) 0;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        if (!in.isReadable()) {
            return;
        }

        in.markReaderIndex();

        byte firstByte = in.readByte();

        if (firstByte == '<') {
            // This is a policy file request
            LOGGER.debug("Policy file request received from {}", ctx.channel().remoteAddress());

            // Reset to consume any remaining policy request data
            in.resetReaderIndex();
            in.skipBytes(in.readableBytes());

            // Send the policy response and close the connection
            ctx.writeAndFlush(Unpooled.copiedBuffer(CROSS_DOMAIN_POLICY, CharsetUtil.UTF_8))
                    .addListener(ChannelFutureListener.CLOSE);
            return;
        }

        // Not a policy request - remove this handler from the pipeline
        // and let other handlers process the data
        ctx.pipeline().remove(this);
        in.resetReaderIndex();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error("Error in policy file handler: {}", cause.getMessage());
        ctx.close();
    }
}