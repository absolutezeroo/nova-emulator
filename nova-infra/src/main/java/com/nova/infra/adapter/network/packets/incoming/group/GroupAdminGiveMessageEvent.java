package com.nova.infra.adapter.network.packets.incoming.group;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record GroupAdminGiveMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
