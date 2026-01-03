package com.nova.infra.adapter.network.packets.outgoing.guide;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record GuideSessionMessage(
    String chatMessage,
    int senderId
) implements IOutgoingPacket {}
