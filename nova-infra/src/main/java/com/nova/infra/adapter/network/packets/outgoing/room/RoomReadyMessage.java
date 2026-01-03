package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomReadyMessage(
    String name,
    int roomId
) implements IOutgoingPacket {}
