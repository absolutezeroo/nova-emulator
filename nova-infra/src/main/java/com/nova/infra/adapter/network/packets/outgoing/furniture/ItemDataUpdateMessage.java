package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record ItemDataUpdateMessage(
    String data
) implements OutgoingPacket {}
