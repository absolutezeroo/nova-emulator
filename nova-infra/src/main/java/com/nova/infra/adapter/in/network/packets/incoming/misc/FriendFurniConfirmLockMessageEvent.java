package com.nova.infra.adapter.in.network.packets.incoming.misc;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record FriendFurniConfirmLockMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
