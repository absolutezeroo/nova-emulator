package com.nova.infra.adapter.in.network.packets.outgoing.unit;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitIdleMessage(
    int unitId,
    boolean isIdle
) implements IOutgoingPacket {}
