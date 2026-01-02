package com.nova.infra.adapter.in.network.packets.incoming.unit;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record RoomUnitSignMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
