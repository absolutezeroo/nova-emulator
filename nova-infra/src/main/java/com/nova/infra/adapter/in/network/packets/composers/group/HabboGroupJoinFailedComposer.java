package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.HabboGroupJoinFailedMessage;

/**
 * Composes HabboGroupJoinFailed packet for client.
 */
public class HabboGroupJoinFailedComposer extends PacketComposer<HabboGroupJoinFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_HABBO_JOIN_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, HabboGroupJoinFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
