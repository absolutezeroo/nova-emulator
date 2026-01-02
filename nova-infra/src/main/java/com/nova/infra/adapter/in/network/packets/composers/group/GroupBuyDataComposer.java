package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupBuyDataMessage;

/**
 * Composes GroupBuyData packet for client.
 */
public class GroupBuyDataComposer extends PacketComposer<GroupBuyDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_CREATE_OPTIONS;
    }

    @Override
    protected void write(PacketBuffer packet, GroupBuyDataMessage message) {
        // No fields to write
    }
}
