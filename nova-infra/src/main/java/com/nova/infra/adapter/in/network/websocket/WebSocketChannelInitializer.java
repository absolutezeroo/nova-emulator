package com.nova.infra.adapter.in.network.websocket;

import com.nova.infra.adapter.in.network.codec.GamePacketEncoder;
import com.nova.infra.adapter.in.network.codec.MessageEncoder;
import com.nova.infra.adapter.in.network.handler.packet.PacketManager;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Initializes the Netty channel pipeline for WebSocket client connections.
 * <p>
 * Pipeline order:
 * 1. HttpServerCodec - HTTP encoding/decoding for WebSocket handshake
 * 2. HttpObjectAggregator - Aggregates HTTP message parts
 * 3. WebSocketServerProtocolHandler - Handles WebSocket upgrade and framing
 * 4. WebSocketFrameHandler - Bridges WebSocket frames to game packet handlers
 * 5. GamePacketEncoder - Encodes outbound ServerMessage packets
 */
public class WebSocketChannelInitializer extends ChannelInitializer<SocketChannel> {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketChannelInitializer.class);

    private static final String WEBSOCKET_PATH = "/";
    private static final int MAX_CONTENT_LENGTH = 65536;

    private final PacketManager packetManager;
    private final MessageEncoder messageEncoder;

    public WebSocketChannelInitializer(PacketManager packetManager, MessageEncoder messageEncoder) {
        this.packetManager = packetManager;
        this.messageEncoder = messageEncoder;
    }

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        // HTTP codec for WebSocket handshake
        pipeline.addLast("httpCodec", new HttpServerCodec());
        pipeline.addLast("httpAggregator", new HttpObjectAggregator(MAX_CONTENT_LENGTH));

        // WebSocket protocol handler (handles upgrade, ping/pong, close frames)
        pipeline.addLast("wsProtocol", new WebSocketServerProtocolHandler(WEBSOCKET_PATH, null, true));

        // Bridge WebSocket frames to game packet handlers
        pipeline.addLast("wsFrameHandler", new WebSocketFrameHandler(packetManager, messageEncoder));

        // Outbound encoder for ServerMessage
        pipeline.addLast("packetEncoder", new GamePacketEncoder());

        LOGGER.debug("Initialized WebSocket channel pipeline for {}", ch.remoteAddress());
    }
}
