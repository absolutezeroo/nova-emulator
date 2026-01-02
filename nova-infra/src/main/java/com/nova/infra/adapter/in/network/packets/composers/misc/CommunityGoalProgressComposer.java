package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CommunityGoalProgressMessage;

/**
 * Composes CommunityGoalProgress packet for client.
 */
public class CommunityGoalProgressComposer extends PacketComposer<CommunityGoalProgressMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.COMMUNITY_GOAL_PROGRESS;
    }

    @Override
    protected void write(PacketBuffer packet, CommunityGoalProgressMessage message) {
        // No fields to write
    }
}
