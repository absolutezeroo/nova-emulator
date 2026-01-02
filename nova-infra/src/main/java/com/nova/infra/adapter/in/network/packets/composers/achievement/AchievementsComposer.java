package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementsMessage;

/**
 * Composes Achievements packet for client.
 */
public class AchievementsComposer extends PacketComposer<AchievementsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACHIEVEMENT_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, AchievementsMessage message) {
        // No fields to write
    }
}
