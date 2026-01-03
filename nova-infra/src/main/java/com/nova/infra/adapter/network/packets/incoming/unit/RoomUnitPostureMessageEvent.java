package com.nova.infra.adapter.network.packets.incoming.unit;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RoomUnitPostureMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
