package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupBadgePartsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupBadgeParts packet for client.
 */
@ComposesPacket(Outgoing.GROUP_BADGE_PARTS)
public class GroupBadgePartsComposer extends PacketComposer<GroupBadgePartsMessage> {
@Override
    protected void write(PacketBuffer packet, GroupBadgePartsMessage message) {
        // No fields to write
    }
}
