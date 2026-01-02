package com.nova.infra.adapter.in.network.packets.outgoing.achievement;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementMessage(
    String stuffCode,
    String badgeCode
) implements IOutgoingPacket {}
