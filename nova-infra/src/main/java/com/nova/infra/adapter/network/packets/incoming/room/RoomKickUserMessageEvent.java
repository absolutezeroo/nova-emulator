package com.nova.infra.adapter.network.packets.incoming.room;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RoomKickUserMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
