package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupInformationMessage;

/**
 * Composes GroupInformation packet for client.
 */
public class GroupInformationComposer extends PacketComposer<GroupInformationMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, GroupInformationMessage message) {
        packet.appendInt(message.id());
        packet.appendInt(message.type());
        packet.appendString(message.title());
        packet.appendString(message.description());
        packet.appendString(message.badge());
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
        packet.appendInt(message.membershipType());
        packet.appendInt(message.membersCount());
        packet.appendBoolean(message.isFavorite());
        packet.appendString(message.createdAt());
        packet.appendBoolean(message.isOwner());
        packet.appendBoolean(message.isAdmin());
        packet.appendString(message.ownerName());
        packet.appendBoolean(message.flag());
        packet.appendBoolean(message.canMembersDecorate());
        packet.appendInt(message.pendingRequestsCount());
    }
}
