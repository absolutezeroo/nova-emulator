package com.nova.infra.adapter.network.packets.incoming.furniture;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record FurnitureWallMultiStateMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
