package com.nova.infra.adapter.network.packets.outgoing.achievement;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementResolutionsMessage(
    int stuffId
) implements OutgoingPacket {}
