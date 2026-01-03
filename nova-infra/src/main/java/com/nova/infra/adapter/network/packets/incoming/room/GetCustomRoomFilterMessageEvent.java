package com.nova.infra.adapter.network.packets.incoming.room;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetCustomRoomFilterMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
