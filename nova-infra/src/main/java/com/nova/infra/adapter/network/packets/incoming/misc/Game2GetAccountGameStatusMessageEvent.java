package com.nova.infra.adapter.network.packets.incoming.misc;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record Game2GetAccountGameStatusMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
