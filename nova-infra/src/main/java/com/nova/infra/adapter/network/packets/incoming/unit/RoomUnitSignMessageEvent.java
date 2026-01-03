package com.nova.infra.adapter.network.packets.incoming.unit;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record RoomUnitSignMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
