package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.AchievementsScoreMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AchievementsScore packet for client.
 */
@ComposesPacket(Outgoing.USER_ACHIEVEMENT_SCORE)
public class AchievementsScoreComposer extends PacketComposer<AchievementsScoreMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementsScoreMessage message) {
        // No fields to write
    }
}
