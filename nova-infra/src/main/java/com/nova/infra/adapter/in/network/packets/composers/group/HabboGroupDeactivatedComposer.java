package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.HabboGroupDeactivatedMessage;

/**
 * Composes HabboGroupDeactivated packet for client.
 */
public class HabboGroupDeactivatedComposer extends PacketComposer<HabboGroupDeactivatedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_DEACTIVATE;
    }

    @Override
    protected void write(PacketBuffer packet, HabboGroupDeactivatedMessage message) {
        packet.appendInt(message.groupId());
    }
}
