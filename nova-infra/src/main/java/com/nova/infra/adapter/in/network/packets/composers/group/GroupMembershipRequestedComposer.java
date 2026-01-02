package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupMembershipRequestedMessage;

/**
 * Composes GroupMembershipRequested packet for client.
 */
public class GroupMembershipRequestedComposer extends PacketComposer<GroupMembershipRequestedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_MEMBERSHIP_REQUESTED;
    }

    @Override
    protected void write(PacketBuffer packet, GroupMembershipRequestedMessage message) {
        packet.appendInt(message.groupId());
    }
}
