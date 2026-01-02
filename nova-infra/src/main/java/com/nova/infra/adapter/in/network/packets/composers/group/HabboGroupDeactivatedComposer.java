package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.HabboGroupDeactivatedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboGroupDeactivated packet for client.
 */
@ComposesPacket(Outgoing.GROUP_DEACTIVATE)
public class HabboGroupDeactivatedComposer extends PacketComposer<HabboGroupDeactivatedMessage> {
@Override
    protected void write(PacketBuffer packet, HabboGroupDeactivatedMessage message) {
        packet.appendInt(message.groupId());
    }
}
