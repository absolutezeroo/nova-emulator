package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.GroupPurchasedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupPurchased packet for client.
 */
@ComposesPacket(Outgoing.GROUP_PURCHASED)
public class GroupPurchasedComposer extends PacketComposer<GroupPurchasedMessage> {
@Override
    protected void write(PacketBuffer packet, GroupPurchasedMessage message) {
        // No fields to write
    }
}
