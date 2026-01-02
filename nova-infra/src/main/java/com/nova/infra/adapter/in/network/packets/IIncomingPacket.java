package com.nova.infra.adapter.in.network.packets;

/**
 * Marker interface for all incoming packet events.
 * <p>
 * Incoming packets are events parsed from client binary data.
 * They represent requests or actions from the client.
 * <p>
 * Implementations should be records or immutable objects containing
 * the parsed data from the client message.
 */
public interface IIncomingPacket {
}
