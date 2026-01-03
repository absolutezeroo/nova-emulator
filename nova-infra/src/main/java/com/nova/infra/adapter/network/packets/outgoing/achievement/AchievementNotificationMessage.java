package com.nova.infra.adapter.network.packets.outgoing.achievement;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record AchievementNotificationMessage(
    // No fields parsed
) implements OutgoingPacket {}
