package com.nova.infra.adapter.in.network.websocket;

import com.nova.infra.adapter.in.network.ClientMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Bridges WebSocket binary frames to the game packet handling system.
 * <p>
 * This handler intercepts BinaryWebSocketFrame messages from the WebSocket
 * protocol handler, extracts the ByteBuf content, decodes it using the
 * same packet format as TCP (4-byte length + 2-byte header + body),
 * and creates ClientMessage objects for processing.
 * <p>
 * This allows Nitro HTML5 clients to connect via WebSocket while reusing
 * all the same packet handling logic as traditional TCP clients.
 */
public class WebSocketFrameHandler extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketFrameHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        LOGGER.info("WebSocket client connected: {}", ctx.channel().remoteAddress());
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        LOGGER.info("WebSocket client disconnected: {}", ctx.channel().remoteAddress());
        super.channelInactive(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, BinaryWebSocketFrame frame) throws Exception {
        ByteBuf content = frame.content();

        if (content.readableBytes() < 6) {
            LOGGER.warn("Received WebSocket frame too small: {} bytes", content.readableBytes());
            return;
        }

        // Read packet structure: 4-byte length + 2-byte header + body
        int length = content.readInt();
        short headerId = content.readShort();

        // Validate length
        int expectedBodyLength = length - 2; // length includes header ID (2 bytes)
        if (content.readableBytes() < expectedBodyLength) {
            LOGGER.warn("Incomplete packet: expected {} bytes, got {}", expectedBodyLength, content.readableBytes());
            return;
        }

        // Read body
        ByteBuf body = Unpooled.copiedBuffer(content.readBytes(expectedBodyLength));

        // Create a ClientMessage and process it
        ClientMessage message = new ClientMessage(headerId, body);

        LOGGER.debug("WebSocket packet received: headerId={}, bodyLength={}", headerId, body.readableBytes());

        // Process the message directly
        processMessage(ctx, message);
    }

    private void processMessage(ChannelHandlerContext ctx, ClientMessage message) {
        try {
            LOGGER.debug("Processing packet from {}: headerId={}", ctx.channel().remoteAddress(), message.getHeaderId());

            // TODO: Route packet to appropriate handler based on headerId
            // Example: packetManager.handle(ctx.channel(), message);

        } finally {
            message.release();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        LOGGER.error("WebSocket error from {}: {}", ctx.channel().remoteAddress(), cause.getMessage(), cause);
        ctx.close();
    }
}
