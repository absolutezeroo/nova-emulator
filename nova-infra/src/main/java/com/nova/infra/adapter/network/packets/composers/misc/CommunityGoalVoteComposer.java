package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CommunityGoalVoteMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CommunityGoalVote packet for client.
 */
@ComposesPacket(Outgoing.COMMUNITY_GOAL_VOTE_EVENT)
public class CommunityGoalVoteComposer extends PacketComposer<CommunityGoalVoteMessage> {
@Override
    protected void write(PacketBuffer packet, CommunityGoalVoteMessage message) {
        // No fields to write
    }
}
