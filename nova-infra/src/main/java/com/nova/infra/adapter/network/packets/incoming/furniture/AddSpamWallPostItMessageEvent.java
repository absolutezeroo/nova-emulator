package com.nova.infra.adapter.network.packets.incoming.furniture;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record AddSpamWallPostItMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
