package com.nova.infra.adapter.network.packets.incoming.furniture;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record FurnitureWallUpdateMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
