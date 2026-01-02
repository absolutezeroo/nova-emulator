package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementResolutionCompletedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes AchievementResolutionCompleted packet for client.
 */
@ComposesPacket(Outgoing.ACHIEVEMENT_RESOLUTION_COMPLETED)
public class AchievementResolutionCompletedComposer extends PacketComposer<AchievementResolutionCompletedMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementResolutionCompletedMessage message) {
        packet.appendString(message.stuffCode());
        packet.appendString(message.badgeCode());
    }
}
