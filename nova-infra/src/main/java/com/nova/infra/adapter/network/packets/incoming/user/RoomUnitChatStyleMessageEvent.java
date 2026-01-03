package com.nova.infra.adapter.network.packets.incoming.user;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RoomUnitChatStyleMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
