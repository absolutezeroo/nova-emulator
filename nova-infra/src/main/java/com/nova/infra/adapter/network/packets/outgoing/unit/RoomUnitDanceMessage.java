package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitDanceMessage(
    int unitId,
    int danceId
) implements IOutgoingPacket {}
