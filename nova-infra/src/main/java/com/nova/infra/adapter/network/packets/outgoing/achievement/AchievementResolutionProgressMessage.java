package com.nova.infra.adapter.network.packets.outgoing.achievement;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementResolutionProgressMessage(
    int stuffId,
    int achievementId,
    String requiredLevelBadgeCode,
    int userProgress,
    int totalProgress,
    int endTime
) implements IOutgoingPacket {}
