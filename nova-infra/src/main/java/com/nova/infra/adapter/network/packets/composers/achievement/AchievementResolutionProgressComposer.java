package com.nova.infra.adapter.network.packets.composers.achievement;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.achievement.AchievementResolutionProgressMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AchievementResolutionProgress packet for client.
 */
@ComposesPacket(Outgoing.ACHIEVEMENT_RESOLUTION_PROGRESS)
public class AchievementResolutionProgressComposer extends PacketComposer<AchievementResolutionProgressMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementResolutionProgressMessage message) {
        packet.appendInt(message.stuffId());
        packet.appendInt(message.achievementId());
        packet.appendString(message.requiredLevelBadgeCode());
        packet.appendInt(message.userProgress());
        packet.appendInt(message.totalProgress());
        packet.appendInt(message.endTime());
    }
}
