package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.WeeklyGameRewardWinnersMessage;

/**
 * Composes WeeklyGameRewardWinners packet for client.
 */
public class WeeklyGameRewardWinnersComposer extends PacketComposer<WeeklyGameRewardWinnersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WEEKLY_GAME_REWARD_WINNERS;
    }

    @Override
    protected void write(PacketBuffer packet, WeeklyGameRewardWinnersMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
