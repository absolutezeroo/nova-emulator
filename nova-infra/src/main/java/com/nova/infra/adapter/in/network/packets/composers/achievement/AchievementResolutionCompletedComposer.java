package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementResolutionCompletedMessage;

/**
 * Composes AchievementResolutionCompleted packet for client.
 */
public class AchievementResolutionCompletedComposer extends PacketComposer<AchievementResolutionCompletedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACHIEVEMENT_RESOLUTION_COMPLETED;
    }

    @Override
    protected void write(PacketBuffer packet, AchievementResolutionCompletedMessage message) {
        packet.appendString(message.stuffCode());
        packet.appendString(message.badgeCode());
    }
}
