package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitInfoMessage(
    int unitId,
    String figure,
    String gender,
    String motto,
    int achievementScore
) implements OutgoingPacket {}
