package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CanCreateRoomMessage(
    boolean canCreate,
    int errorCode
) implements OutgoingPacket {}
