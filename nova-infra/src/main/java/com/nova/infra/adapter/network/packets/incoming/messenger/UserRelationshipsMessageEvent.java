package com.nova.infra.adapter.network.packets.incoming.messenger;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record UserRelationshipsMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
