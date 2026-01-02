package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CommunityGoalEarnedPrizesMessage;

/**
 * Composes CommunityGoalEarnedPrizes packet for client.
 */
public class CommunityGoalEarnedPrizesComposer extends PacketComposer<CommunityGoalEarnedPrizesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMMUNITY_GOAL_EARNED_PRIZES;
    }

    @Override
    protected void write(PacketBuffer packet, CommunityGoalEarnedPrizesMessage message) {
        // No fields to write
    }
}
