package com.nova.infra.adapter.in.network.server;

import com.nova.infra.adapter.in.network.codec.GameByteFrameDecoder;
import com.nova.infra.adapter.in.network.codec.GamePacketDecoder;
import com.nova.infra.adapter.in.network.codec.GamePacketEncoder;
import com.nova.infra.adapter.in.network.handler.GameHandler;
import com.nova.infra.adapter.in.network.handler.PolicyFileHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Initializes the Netty channel pipeline for TCP game client connections.
 * <p>
 * Pipeline order (inbound flow):
 * 1. PolicyFileHandler - Handles Flash/Nitro cross-domain policy requests
 * 2. GameByteFrameDecoder - Extracts frames based on 4-byte length field
 * 3. GamePacketDecoder - Decodes 2-byte header ID and body into ClientMessage
 * 4. GamePacketEncoder - Encodes ServerMessage for outbound transmission
 * 5. GameHandler - Final handler that processes decoded packets
 */
public class GameChannelInitializer extends ChannelInitializer<SocketChannel> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameChannelInitializer.class);

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        // Inbound decoders (processed in order)
        pipeline.addLast("policy", new PolicyFileHandler());
        pipeline.addLast("frameDecoder", new GameByteFrameDecoder());
        pipeline.addLast("packetDecoder", new GamePacketDecoder());

        // Outbound encoder
        pipeline.addLast("packetEncoder", new GamePacketEncoder());

        // Final handler
        pipeline.addLast("handler", new GameHandler());

        LOGGER.debug("Initialized TCP channel pipeline for {}", ch.remoteAddress());
    }
}
