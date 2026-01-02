package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupPurchasedMessage;

/**
 * Composes GroupPurchased packet for client.
 */
public class GroupPurchasedComposer extends PacketComposer<GroupPurchasedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_PURCHASED;
    }

    @Override
    protected void write(PacketBuffer packet, GroupPurchasedMessage message) {
        // No fields to write
    }
}
