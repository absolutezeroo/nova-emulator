package com.nova.infra.adapter.network.packets.outgoing.achievement;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementMessage(
    String stuffCode,
    String badgeCode
) implements OutgoingPacket {}
