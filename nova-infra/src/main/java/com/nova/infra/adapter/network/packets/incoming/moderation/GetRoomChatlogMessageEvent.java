package com.nova.infra.adapter.network.packets.incoming.moderation;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record GetRoomChatlogMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
