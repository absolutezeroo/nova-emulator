package com.nova.infra.adapter.network.packets.outgoing.achievement;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementResolutionsMessage(
    int stuffId
) implements IOutgoingPacket {}
