package com.nova.infra.adapter.in.network.packets.outgoing.guide;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideSessionDetachedMessage(
    // No fields parsed
) implements IOutgoingPacket {}
