package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CommunityGoalProgressMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CommunityGoalProgress packet for client.
 */
@ComposesPacket(Outgoing.COMMUNITY_GOAL_PROGRESS)
public class CommunityGoalProgressComposer extends PacketComposer<CommunityGoalProgressMessage> {
@Override
    protected void write(PacketBuffer packet, CommunityGoalProgressMessage message) {
        // No fields to write
    }
}
