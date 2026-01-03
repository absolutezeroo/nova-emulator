package com.nova.infra.adapter.network.packets.outgoing.moderation;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record ModeratorInitMessage(
    // No fields parsed
) implements OutgoingPacket {}
