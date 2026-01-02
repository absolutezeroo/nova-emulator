package com.nova.infra.adapter.in.network.server;

import com.nova.core.domain.port.out.network.GameServerPort;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Netty TCP implementation of {@link GameServerPort}.
 * <p>
 * This is an inbound adapter that handles raw TCP connections
 * from Flash/Air Habbo clients. It implements the core's GameServerPort
 * interface, hiding all Netty details from the domain layer.
 */
public class GameServer implements GameServerPort {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameServer.class);
    private static final String TYPE = "TCP";

    private final String host;
    private final int port;
    private final ChannelInitializer<SocketChannel> channelInitializer;

    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private Channel serverChannel;

    public GameServer(String host, int port, ChannelInitializer<SocketChannel> channelInitializer) {
        this.host = host;
        this.port = port;
        this.channelInitializer = channelInitializer;
    }

    @Override
    public void start() throws InterruptedException {
        bossGroup = new NioEventLoopGroup(1);
        workerGroup = new NioEventLoopGroup();

        ServerBootstrap bootstrap = new ServerBootstrap()
                .group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(channelInitializer)
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true);

        ChannelFuture future = bootstrap.bind(host, port).sync();
        serverChannel = future.channel();

        LOGGER.info("{} server started on {}:{}", TYPE, host, port);
    }

    @Override
    public void stop() {
        LOGGER.info("Stopping {} server...", TYPE);

        if (serverChannel != null) {
            serverChannel.close();
        }

        if (workerGroup != null) {
            workerGroup.shutdownGracefully();
        }

        if (bossGroup != null) {
            bossGroup.shutdownGracefully();
        }

        LOGGER.info("{} server stopped", TYPE);
    }

    @Override
    public boolean isRunning() {
        return serverChannel != null && serverChannel.isActive();
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
