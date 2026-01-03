package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideSessionAttachedMessage(
    boolean asGuide,
    int helpRequestType,
    String helpRequestDescription,
    int roleSpecificWaitTime
) implements OutgoingPacket {}
