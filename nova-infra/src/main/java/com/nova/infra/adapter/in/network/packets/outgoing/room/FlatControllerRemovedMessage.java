package com.nova.infra.adapter.in.network.packets.outgoing.room;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FlatControllerRemovedMessage(
    int roomId,
    int userId
) implements IOutgoingPacket {}
