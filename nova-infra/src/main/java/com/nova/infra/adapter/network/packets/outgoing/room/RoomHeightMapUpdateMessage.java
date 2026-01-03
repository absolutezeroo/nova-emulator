package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomHeightMapUpdateMessage(
    // No fields parsed
) implements OutgoingPacket {}
