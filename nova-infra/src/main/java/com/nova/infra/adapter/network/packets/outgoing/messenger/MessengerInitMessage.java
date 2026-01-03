package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record MessengerInitMessage(
    int userFriendLimit,
    int normalFriendLimit,
    int extendedFriendLimit
) implements OutgoingPacket {}
