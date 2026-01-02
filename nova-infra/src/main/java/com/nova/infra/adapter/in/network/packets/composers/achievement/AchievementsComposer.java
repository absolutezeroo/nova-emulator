package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Achievements packet for client.
 */
@ComposesPacket(Outgoing.ACHIEVEMENT_LIST)
public class AchievementsComposer extends PacketComposer<AchievementsMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementsMessage message) {
        // No fields to write
    }
}
