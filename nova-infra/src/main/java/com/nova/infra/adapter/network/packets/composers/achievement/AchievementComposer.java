package com.nova.infra.adapter.network.packets.composers.achievement;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.achievement.AchievementMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes Achievement packet for client.
 */
@ComposesPacket(Outgoing.ACHIEVEMENT_PROGRESSED)
public class AchievementComposer extends PacketComposer<AchievementMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementMessage message) {
        packet.appendString(message.stuffCode());
        packet.appendString(message.badgeCode());
    }
}
