package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupMembersMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupMembers packet for client.
 */
@ComposesPacket(Outgoing.GROUP_MEMBERS)
public class GroupMembersComposer extends PacketComposer<GroupMembersMessage> {
@Override
    protected void write(PacketBuffer packet, GroupMembersMessage message) {
        packet.appendInt(message.groupId());
        packet.appendString(message.groupTitle());
        packet.appendInt(message.roomId());
        packet.appendString(message.badge());
        packet.appendInt(message.totalMembersCount());
    }
}
