package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitIdleMessage(
    int unitId,
    boolean isIdle
) implements OutgoingPacket {}
