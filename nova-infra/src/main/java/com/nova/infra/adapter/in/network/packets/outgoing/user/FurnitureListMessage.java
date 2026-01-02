package com.nova.infra.adapter.in.network.packets.outgoing.user;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

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
) implements IOutgoingPacket {}
