package com.nova.infra.adapter.network.websocket;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

/**
 * Wraps outgoing ByteBuf data in BinaryWebSocketFrame for WebSocket clients.
 * <p>
 * This encoder intercepts ByteBuf writes and wraps them in BinaryWebSocketFrame
 * before passing them to the WebSocket protocol handler.
 */
public class WebSocketBinaryEncoder extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        if (msg instanceof ByteBuf byteBuf) {
            // Wrap ByteBuf in BinaryWebSocketFrame for WebSocket protocol
            BinaryWebSocketFrame frame = new BinaryWebSocketFrame(byteBuf);
            ctx.write(frame, promise);
        } else {
            // Pass through other message types unchanged
            ctx.write(msg, promise);
        }
    }
}
