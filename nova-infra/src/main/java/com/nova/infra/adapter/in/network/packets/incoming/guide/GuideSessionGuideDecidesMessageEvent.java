package com.nova.infra.adapter.in.network.packets.incoming.guide;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GuideSessionGuideDecidesMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
