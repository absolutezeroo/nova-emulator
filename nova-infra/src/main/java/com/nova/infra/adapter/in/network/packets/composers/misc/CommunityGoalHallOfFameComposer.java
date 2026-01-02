package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CommunityGoalHallOfFameMessage;

/**
 * Composes CommunityGoalHallOfFame packet for client.
 */
public class CommunityGoalHallOfFameComposer extends PacketComposer<CommunityGoalHallOfFameMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMMUNITY_GOAL_HALL_OF_FAME;
    }

    @Override
    protected void write(PacketBuffer packet, CommunityGoalHallOfFameMessage message) {
        // No fields to write
    }
}
