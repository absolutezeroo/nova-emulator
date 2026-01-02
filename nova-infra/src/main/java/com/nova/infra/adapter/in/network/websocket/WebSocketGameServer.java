package com.nova.infra.adapter.in.network.websocket;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WebSocket game server for Nitro client connections.
 * <p>
 * Nitro HTML5 client uses WebSockets instead of raw TCP.
 * This server handles the HTTP upgrade and WebSocket framing,
 * then delegates to the same packet handlers as the TCP server.
 */
public class WebSocketGameServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebSocketGameServer.class);

    private final String host;
    private final int port;
    private final ChannelInitializer<SocketChannel> channelInitializer;

    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private Channel serverChannel;

    public WebSocketGameServer(String host, int port, ChannelInitializer<SocketChannel> channelInitializer) {
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

        LOGGER.info("WebSocket server started on {}:{}", host, port);
    }

    public void stop() {
        LOGGER.info("Stopping WebSocket server...");

        if (serverChannel != null) {
            serverChannel.close();
        }

        if (workerGroup != null) {
            workerGroup.shutdownGracefully();
        }

        if (bossGroup != null) {
            bossGroup.shutdownGracefully();
        }

        LOGGER.info("WebSocket server stopped");
    }

    public boolean isRunning() {
        return serverChannel != null && serverChannel.isActive();
    }
}
