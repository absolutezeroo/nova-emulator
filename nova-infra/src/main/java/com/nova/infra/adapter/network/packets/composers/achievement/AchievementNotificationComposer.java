package com.nova.infra.adapter.network.packets.composers.achievement;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.achievement.AchievementNotificationMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AchievementNotification packet for client.
 */
@ComposesPacket(Outgoing.ACHIEVEMENT_NOTIFICATION)
public class AchievementNotificationComposer extends PacketComposer<AchievementNotificationMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementNotificationMessage message) {
        // No fields to write
    }
}
