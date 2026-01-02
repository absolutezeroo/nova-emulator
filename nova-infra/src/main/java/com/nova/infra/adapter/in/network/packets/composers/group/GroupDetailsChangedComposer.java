package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupDetailsChangedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupDetailsChanged packet for client.
 */
@ComposesPacket(Outgoing.GROUP_DETAILS_CHANGED)
public class GroupDetailsChangedComposer extends PacketComposer<GroupDetailsChangedMessage> {
@Override
    protected void write(PacketBuffer packet, GroupDetailsChangedMessage message) {
        packet.appendInt(message.groupId());
    }
}
