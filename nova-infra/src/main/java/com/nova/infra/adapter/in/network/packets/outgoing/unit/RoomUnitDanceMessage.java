package com.nova.infra.adapter.in.network.packets.outgoing.unit;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitDanceMessage(
    int unitId,
    int danceId
) implements IOutgoingPacket {}
