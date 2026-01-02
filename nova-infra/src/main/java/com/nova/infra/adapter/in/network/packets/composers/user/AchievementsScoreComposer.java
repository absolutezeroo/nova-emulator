package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.AchievementsScoreMessage;

/**
 * Composes AchievementsScore packet for client.
 */
public class AchievementsScoreComposer extends PacketComposer<AchievementsScoreMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_ACHIEVEMENT_SCORE;
    }

    @Override
    protected void write(PacketBuffer packet, AchievementsScoreMessage message) {
        // No fields to write
    }
}
