package com.nova.infra.adapter.network.packets;

/**
 * Marker interface for all outgoing packet messages.
 * <p>
 * Outgoing packets are data transfer objects that will be
 * serialized and sent to the client.
 * <p>
 * Implementations should be records containing the data
 * to be composed into a binary packet.
 */
public interface IOutgoingPacket {
}
