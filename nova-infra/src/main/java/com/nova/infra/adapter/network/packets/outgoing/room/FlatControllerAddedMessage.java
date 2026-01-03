package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record FlatControllerAddedMessage(
    int roomId
) implements IOutgoingPacket {}
