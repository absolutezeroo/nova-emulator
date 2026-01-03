package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FlatControllerRemovedMessage(
    int roomId,
    int userId
) implements IOutgoingPacket {}
