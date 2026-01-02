package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ConcurrentUsersGoalProgressMessage;

/**
 * Composes ConcurrentUsersGoalProgress packet for client.
 */
public class ConcurrentUsersGoalProgressComposer extends PacketComposer<ConcurrentUsersGoalProgressMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CONCURRENT_USERS_GOAL_PROGRESS;
    }

    @Override
    protected void write(PacketBuffer packet, ConcurrentUsersGoalProgressMessage message) {
        packet.appendInt(message.state());
        packet.appendInt(message.userCount());
        packet.appendInt(message.userCountGoal());
    }
}
