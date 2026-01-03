package com.nova.infra.adapter.network.packets.incoming.room;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record CreateFlatMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
