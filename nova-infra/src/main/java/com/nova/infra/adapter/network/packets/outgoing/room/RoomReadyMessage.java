package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomReadyMessage(
    String name,
    int roomId
) implements OutgoingPacket {}
