package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureFloorRemoveMessage(
    boolean isExpired,
    int userId,
    int delay
) implements OutgoingPacket {}
