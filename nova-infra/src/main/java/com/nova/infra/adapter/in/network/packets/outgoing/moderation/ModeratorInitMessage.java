package com.nova.infra.adapter.in.network.packets.outgoing.moderation;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record ModeratorInitMessage(
    // No fields parsed
) implements IOutgoingPacket {}
