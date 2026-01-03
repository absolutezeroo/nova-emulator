package com.nova.infra.adapter.network.packets.outgoing.unit;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RoomUnitHandItemMessage(
    int unitId,
    int handId
) implements OutgoingPacket {}
