package com.nova.infra.adapter.network.packets.outgoing.group;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuildMembershipsMessage(
    // No fields parsed
) implements OutgoingPacket {}
