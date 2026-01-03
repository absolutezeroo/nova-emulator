package com.nova.infra.adapter.network.packets.composers.achievement;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.achievement.AchievementResolutionsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes AchievementResolutions packet for client.
 */
@ComposesPacket(Outgoing.ACHIEVEMENT_RESOLUTIONS)
public class AchievementResolutionsComposer extends PacketComposer<AchievementResolutionsMessage> {
@Override
    protected void write(PacketBuffer packet, AchievementResolutionsMessage message) {
        packet.appendInt(message.stuffId());
    }
}
