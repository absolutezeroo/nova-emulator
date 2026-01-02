package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.HabboGroupJoinFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboGroupJoinFailed packet for client.
 */
@ComposesPacket(Outgoing.GROUP_HABBO_JOIN_FAILED)
public class HabboGroupJoinFailedComposer extends PacketComposer<HabboGroupJoinFailedMessage> {
@Override
    protected void write(PacketBuffer packet, HabboGroupJoinFailedMessage message) {
        packet.appendInt(message.reason());
    }
}
