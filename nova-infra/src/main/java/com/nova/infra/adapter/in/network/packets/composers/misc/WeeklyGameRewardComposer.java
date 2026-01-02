package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.WeeklyGameRewardMessage;

/**
 * Composes WeeklyGameReward packet for client.
 */
public class WeeklyGameRewardComposer extends PacketComposer<WeeklyGameRewardMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WEEKLY_GAME_REWARD;
    }

    @Override
    protected void write(PacketBuffer packet, WeeklyGameRewardMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
