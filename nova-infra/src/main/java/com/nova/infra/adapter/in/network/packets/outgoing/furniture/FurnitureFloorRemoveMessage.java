package com.nova.infra.adapter.in.network.packets.outgoing.furniture;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureFloorRemoveMessage(
    boolean isExpired,
    int userId,
    int delay
) implements IOutgoingPacket {}
