package com.nova.infra.adapter.in.network.packets.outgoing.room;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomEntryInfoMessage(
    int roomId,
    boolean isOwner
) implements IOutgoingPacket {}
