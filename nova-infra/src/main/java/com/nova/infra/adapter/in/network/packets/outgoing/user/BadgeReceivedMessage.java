package com.nova.infra.adapter.in.network.packets.outgoing.user;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record BadgeReceivedMessage(
    int badgeId,
    String badgeCode
) implements IOutgoingPacket {}
