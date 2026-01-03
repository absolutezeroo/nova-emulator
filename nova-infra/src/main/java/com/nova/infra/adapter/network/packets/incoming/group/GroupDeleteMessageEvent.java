package com.nova.infra.adapter.network.packets.incoming.group;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record GroupDeleteMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
