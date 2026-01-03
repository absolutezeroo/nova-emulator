package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record BadgeReceivedMessage(
    int badgeId,
    String badgeCode
) implements IOutgoingPacket {}
