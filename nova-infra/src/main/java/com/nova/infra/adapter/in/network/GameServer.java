package com.nova.infra.adapter.in.network;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Netty-based game server (Inbound Adapter).
 * Handles client connections and packet routing.
 */
public class GameServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(GameServer.class);

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

        LOGGER.info("Game server started on {}:{}", host, port);
    }

    public void stop() {
        LOGGER.info("Stopping game server...");

        if (serverChannel != null) {
            serverChannel.close();
        }

        if (workerGroup != null) {
            workerGroup.shutdownGracefully();
        }

        if (bossGroup != null) {
            bossGroup.shutdownGracefully();
        }

        LOGGER.info("Game server stopped");
    }

    public boolean isRunning() {
        return serverChannel != null && serverChannel.isActive();
    }
}
