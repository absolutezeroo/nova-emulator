package com.nova.infra.adapter.network.packets.incoming.moderation;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record ModerateRoomMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
