package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupMembershipRequestedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupMembershipRequested packet for client.
 */
@ComposesPacket(Outgoing.GROUP_MEMBERSHIP_REQUESTED)
public class GroupMembershipRequestedComposer extends PacketComposer<GroupMembershipRequestedMessage> {
@Override
    protected void write(PacketBuffer packet, GroupMembershipRequestedMessage message) {
        packet.appendInt(message.groupId());
    }
}
