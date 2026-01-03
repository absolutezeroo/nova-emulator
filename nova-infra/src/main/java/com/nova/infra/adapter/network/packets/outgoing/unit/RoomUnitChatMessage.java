package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitChatMessage(
    int roomIndex,
    String message,
    int gesture,
    int bubble,
    int messageLength
) implements OutgoingPacket {}
