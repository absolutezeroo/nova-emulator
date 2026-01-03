package com.nova.infra.adapter.network.packets.outgoing.moderation;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record ModeratorCautionMessage(
    // No fields parsed
) implements IOutgoingPacket {}
