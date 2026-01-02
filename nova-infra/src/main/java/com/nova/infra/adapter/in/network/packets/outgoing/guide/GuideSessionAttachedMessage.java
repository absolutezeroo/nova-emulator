package com.nova.infra.adapter.in.network.packets.outgoing.guide;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideSessionAttachedMessage(
    boolean asGuide,
    int helpRequestType,
    String helpRequestDescription,
    int roleSpecificWaitTime
) implements IOutgoingPacket {}
