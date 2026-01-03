package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitMessage(
    int roomIndex,
    String message,
    int gesture,
    int bubble,
    int messageLength
) implements OutgoingPacket {}
