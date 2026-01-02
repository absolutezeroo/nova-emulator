package com.nova.infra.adapter.in.network.handler;

import com.nova.core.domain.port.out.network.NetworkConnection;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.codec.MessageEncoder;
import com.nova.infra.adapter.in.network.handler.packet.PacketManager;
import com.nova.infra.adapter.in.network.session.NettyConnection;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Final handler in the Netty pipeline that processes decoded ClientMessage packets.
 * <p>
 * This handler:
 * 1. Creates a {@link NettyConnection} wrapper on client connect
 * 2. Routes incoming packets to the {@link PacketManager}
 * 3. Cleans up resources on disconnect
 * <p>
 * This is the bridge between Netty (infrastructure) and the packet routing system.
 */
public class GameHandler extends SimpleChannelInboundHandler<ClientMessage> {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameHandler.class);

    private final PacketManager packetManager;
    private final MessageEncoder messageEncoder;

    public GameHandler(PacketManager packetManager, MessageEncoder messageEncoder) {
        this.packetManager = packetManager;
        this.messageEncoder = messageEncoder;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // Create NetworkConnection wrapper for this channel
        NettyConnection connection = new NettyConnection(ctx.channel(), messageEncoder);

        LOGGER.info("Client connected: {} (session: {})",
                connection.getIpAddress(), connection.getId());

        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        NetworkConnection connection = NettyConnection.fromChannel(ctx.channel());

        if (connection != null) {
            LOGGER.info("Client disconnected: {} (session: {})",
                    connection.getIpAddress(), connection.getId());

            // TODO: Notify domain layer of disconnect via ConnectionListener
        } else {
            LOGGER.info("Client disconnected: {}", ctx.channel().remoteAddress());
        }

        super.channelInactive(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ClientMessage msg) throws Exception {
        NetworkConnection connection = NettyConnection.fromChannel(ctx.channel());

        if (connection == null) {
            LOGGER.error("No connection found for channel, dropping packet");
            msg.release();
            return;
        }

        LOGGER.debug("Received packet from {}: headerId={}",
                connection.getIpAddress(), msg.getHeaderId());

        try {
            // Route packet to appropriate handler
            boolean handled = packetManager.handle(connection, msg);

            if (!handled) {
                LOGGER.debug("Unhandled packet ID {} from {}",
                        msg.getHeaderId(), connection.getIpAddress());
            }
        } finally {
            // Always release the message buffer
            msg.release();
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        NetworkConnection connection = NettyConnection.fromChannel(ctx.channel());
        String clientInfo = connection != null ? connection.getIpAddress() : ctx.channel().remoteAddress().toString();

        LOGGER.error("Error handling packet from {}: {}", clientInfo, cause.getMessage(), cause);

        ctx.close();
    }
}
