package com.nova.infra.adapter.network.packets.composers.achievement;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.achievement.AchievementsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
