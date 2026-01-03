package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureListMessage(
    int itemId,
    String furniType,
    int ref,
    int spriteId,
    int category,
    boolean isRecyclable,
    boolean tradable,
    boolean isGroupable,
    boolean sellable,
    int secondsToExpiration
) implements OutgoingPacket {}
