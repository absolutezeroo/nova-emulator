package com.nova.infra.adapter.in.network.session;

import com.nova.core.domain.port.out.network.NetworkConnection;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Netty implementation of {@link NetworkConnection}.
 * <p>
 * This class encapsulates all Netty-specific code, hiding the Channel
 * from the domain layer. The domain only sees the NetworkConnection interface.
 * <p>
 * Responsibilities:
 * - Wrap Netty Channel for send/disconnect operations
 * - Send ByteBuf packets directly to the client
 * - Store connection attributes (authenticated user, session data)
 */
public class NettyConnection implements NetworkConnection {

    private static final Logger LOGGER = LoggerFactory.getLogger(NettyConnection.class);
    private static final AttributeKey<NettyConnection> CONNECTION_KEY = AttributeKey.valueOf("connection");

    private final String id;
    private final Channel channel;
    private final Map<String, Object> attributes;

    public NettyConnection(Channel channel) {
        this.id = UUID.randomUUID().toString();
        this.channel = channel;
        this.attributes = new ConcurrentHashMap<>();

        // Store reference in channel for later retrieval
        channel.attr(CONNECTION_KEY).set(this);
    }

    /**
     * Retrieves the NettyConnection associated with a Channel.
     */
    public static NettyConnection fromChannel(Channel channel) {
        return channel.attr(CONNECTION_KEY).get();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getIpAddress() {
        InetSocketAddress address = (InetSocketAddress) channel.remoteAddress();

        if (address != null) {
            return address.getAddress().getHostAddress();
        }

        return "unknown";
    }

    @Override
    public void send(Object response) {
        if (!isConnected()) {
            LOGGER.warn("Attempted to send to disconnected client: {}", id);
            return;
        }

        try {
            // ByteBuf can be sent directly (from PacketBuffer.getBuffer())
            if (response instanceof ByteBuf byteBuf) {
                int size = byteBuf.readableBytes();
                channel.writeAndFlush(byteBuf);
                LOGGER.debug("Sent packet to {} ({} bytes)", id, size);
            } else {
                // For other types, just write directly (let encoder handle)
                channel.writeAndFlush(response);
                LOGGER.debug("Sent response to {}: {}", id, response.getClass().getSimpleName());
            }
        } catch (Exception e) {
            LOGGER.error("Failed to send response to {}: {}", id, e.getMessage());
        }
    }

    @Override
    public void disconnect() {
        if (channel.isActive()) {
            LOGGER.info("Disconnecting client: {} ({})", id, getIpAddress());

            channel.close();
        }
    }

    @Override
    public boolean isConnected() {
        return channel.isActive();
    }

    @Override
    public void setAttribute(String key, Object value) {
        if (value == null) {
            attributes.remove(key);
        } else {
            attributes.put(key, value);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getAttribute(String key, Class<T> type) {
        Object value = attributes.get(key);

        if (value != null && type.isInstance(value)) {
            return (T) value;
        }

        return null;
    }

    /**
     * Returns the underlying Netty channel.
     */
    Channel getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "NettyConnection{id=" + id + ", ip=" + getIpAddress() + ", connected=" + isConnected() + "}";
    }
}
