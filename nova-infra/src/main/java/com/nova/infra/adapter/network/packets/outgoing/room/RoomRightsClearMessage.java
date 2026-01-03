package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomRightsClearMessage(
    // No fields parsed
) implements IOutgoingPacket {}
