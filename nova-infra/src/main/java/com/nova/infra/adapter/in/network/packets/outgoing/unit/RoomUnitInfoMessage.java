package com.nova.infra.adapter.in.network.packets.outgoing.unit;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitInfoMessage(
    int unitId,
    String figure,
    String gender,
    String motto,
    int achievementScore
) implements IOutgoingPacket {}
