package com.nova.infra.adapter.in.network.packets.outgoing.unit;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitChatMessage(
    int roomIndex,
    String message,
    int gesture,
    int bubble,
    int messageLength
) implements IOutgoingPacket {}
