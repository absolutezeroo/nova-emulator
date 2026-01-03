package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.WeeklyGameRewardMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes WeeklyGameReward packet for client.
 */
@ComposesPacket(Outgoing.WEEKLY_GAME_REWARD)
public class WeeklyGameRewardComposer extends PacketComposer<WeeklyGameRewardMessage> {
@Override
    protected void write(PacketBuffer packet, WeeklyGameRewardMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
