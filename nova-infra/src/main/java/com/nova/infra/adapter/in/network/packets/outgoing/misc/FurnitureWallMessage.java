package com.nova.infra.adapter.in.network.packets.outgoing.misc;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FurnitureWallMessage(
    int spriteId,
    String location,
    String stuffData,
    int secondsToExpiration,
    int usagePolicy,
    int userId
) implements IOutgoingPacket {}
