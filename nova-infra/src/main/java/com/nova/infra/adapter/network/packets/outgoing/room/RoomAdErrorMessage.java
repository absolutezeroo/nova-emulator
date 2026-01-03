package com.nova.infra.adapter.network.packets.outgoing.room;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomAdErrorMessage(
    int errorCode,
    String filteredText
) implements OutgoingPacket {}
