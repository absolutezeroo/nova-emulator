package com.nova.infra.adapter.network.packets.outgoing.furniture;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RequestSpamWallPostItMessage(
    int itemId,
    String location
) implements OutgoingPacket {}
