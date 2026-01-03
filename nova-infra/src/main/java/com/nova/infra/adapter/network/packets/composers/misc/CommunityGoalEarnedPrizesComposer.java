package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CommunityGoalEarnedPrizesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CommunityGoalEarnedPrizes packet for client.
 */
@ComposesPacket(Outgoing.COMMUNITY_GOAL_EARNED_PRIZES)
public class CommunityGoalEarnedPrizesComposer extends PacketComposer<CommunityGoalEarnedPrizesMessage> {
@Override
    protected void write(PacketBuffer packet, CommunityGoalEarnedPrizesMessage message) {
        // No fields to write
    }
}
