package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementResolutionProgressMessage;

/**
 * Composes AchievementResolutionProgress packet for client.
 */
public class AchievementResolutionProgressComposer extends PacketComposer<AchievementResolutionProgressMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACHIEVEMENT_RESOLUTION_PROGRESS;
    }

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
