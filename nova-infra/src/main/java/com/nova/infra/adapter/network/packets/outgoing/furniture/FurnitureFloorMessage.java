package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureFloorMessage(
    int itemId,
    int spriteId,
    int x,
    int y,
    int extra,
    int expires,
    int usagePolicy,
    int userId,
    String spriteName
) implements OutgoingPacket {}
