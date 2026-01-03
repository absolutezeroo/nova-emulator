package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CommunityGoalHallOfFameMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CommunityGoalHallOfFame packet for client.
 */
@ComposesPacket(Outgoing.COMMUNITY_GOAL_HALL_OF_FAME)
public class CommunityGoalHallOfFameComposer extends PacketComposer<CommunityGoalHallOfFameMessage> {
@Override
    protected void write(PacketBuffer packet, CommunityGoalHallOfFameMessage message) {
        // No fields to write
    }
}
