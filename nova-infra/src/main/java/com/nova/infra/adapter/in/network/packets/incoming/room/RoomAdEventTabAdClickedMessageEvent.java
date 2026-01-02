package com.nova.infra.adapter.in.network.packets.incoming.room;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RoomAdEventTabAdClickedMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
