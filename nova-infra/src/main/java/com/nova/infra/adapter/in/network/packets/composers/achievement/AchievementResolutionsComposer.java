package com.nova.infra.adapter.in.network.packets.composers.achievement;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.achievement.AchievementResolutionsMessage;

/**
 * Composes AchievementResolutions packet for client.
 */
public class AchievementResolutionsComposer extends PacketComposer<AchievementResolutionsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ACHIEVEMENT_RESOLUTIONS;
    }

    @Override
    protected void write(PacketBuffer packet, AchievementResolutionsMessage message) {
        packet.appendInt(message.stuffId());
    }
}
