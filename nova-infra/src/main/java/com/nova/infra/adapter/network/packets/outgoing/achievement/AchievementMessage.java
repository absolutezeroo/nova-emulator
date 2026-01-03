package com.nova.infra.adapter.network.packets.outgoing.achievement;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementMessage(
    String stuffCode,
    String badgeCode
) implements IOutgoingPacket {}
