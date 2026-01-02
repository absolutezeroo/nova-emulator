package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupConfirmMemberRemoveMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GroupConfirmMemberRemove packet for client.
 */
@ComposesPacket(Outgoing.GROUP_MEMBER_REMOVE_CONFIRM)
public class GroupConfirmMemberRemoveComposer extends PacketComposer<GroupConfirmMemberRemoveMessage> {
@Override
    protected void write(PacketBuffer packet, GroupConfirmMemberRemoveMessage message) {
        // No fields to write
    }
}
