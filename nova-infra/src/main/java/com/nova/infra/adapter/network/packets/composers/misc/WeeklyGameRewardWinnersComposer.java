package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.WeeklyGameRewardWinnersMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes WeeklyGameRewardWinners packet for client.
 */
@ComposesPacket(Outgoing.WEEKLY_GAME_REWARD_WINNERS)
public class WeeklyGameRewardWinnersComposer extends PacketComposer<WeeklyGameRewardWinnersMessage> {
@Override
    protected void write(PacketBuffer packet, WeeklyGameRewardWinnersMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
