package com.nova.infra.adapter.network.packets.incoming.user;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record SetActivatedBadgesMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
