package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupMembersMessage;

/**
 * Composes GroupMembers packet for client.
 */
public class GroupMembersComposer extends PacketComposer<GroupMembersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_MEMBERS;
    }

    @Override
    protected void write(PacketBuffer packet, GroupMembersMessage message) {
        packet.appendInt(message.groupId());
        packet.appendString(message.groupTitle());
        packet.appendInt(message.roomId());
        packet.appendString(message.badge());
        packet.appendInt(message.totalMembersCount());
    }
}
