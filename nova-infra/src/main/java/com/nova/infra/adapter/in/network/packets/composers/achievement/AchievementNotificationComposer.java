package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementNotificationMessage;

/**
 * Composes AchievementNotification packet for client.
 */
public class AchievementNotificationComposer extends PacketComposer<AchievementNotificationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACHIEVEMENT_NOTIFICATION;
    }

    @Override
    protected void write(PacketBuffer packet, AchievementNotificationMessage message) {
        // No fields to write
    }
}
