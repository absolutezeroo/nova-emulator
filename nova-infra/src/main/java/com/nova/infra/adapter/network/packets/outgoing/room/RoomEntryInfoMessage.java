package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomEntryInfoMessage(
    int roomId,
    boolean isOwner
) implements OutgoingPacket {}
