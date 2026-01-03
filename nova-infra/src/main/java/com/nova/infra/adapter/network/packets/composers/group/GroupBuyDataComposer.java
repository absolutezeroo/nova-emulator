package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.GroupBuyDataMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupBuyData packet for client.
 */
@ComposesPacket(Outgoing.GROUP_CREATE_OPTIONS)
public class GroupBuyDataComposer extends PacketComposer<GroupBuyDataMessage> {
@Override
    protected void write(PacketBuffer packet, GroupBuyDataMessage message) {
        // No fields to write
    }
}
