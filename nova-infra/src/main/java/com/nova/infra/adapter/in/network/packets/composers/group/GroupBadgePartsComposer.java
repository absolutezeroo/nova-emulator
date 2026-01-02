package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupBadgePartsMessage;

/**
 * Composes GroupBadgeParts packet for client.
 */
public class GroupBadgePartsComposer extends PacketComposer<GroupBadgePartsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_BADGE_PARTS;
    }

    @Override
    protected void write(PacketBuffer packet, GroupBadgePartsMessage message) {
        // No fields to write
    }
}
