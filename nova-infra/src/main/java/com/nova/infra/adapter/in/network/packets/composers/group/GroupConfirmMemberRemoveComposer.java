package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GroupConfirmMemberRemoveMessage;

/**
 * Composes GroupConfirmMemberRemove packet for client.
 */
public class GroupConfirmMemberRemoveComposer extends PacketComposer<GroupConfirmMemberRemoveMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_MEMBER_REMOVE_CONFIRM;
    }

    @Override
    protected void write(PacketBuffer packet, GroupConfirmMemberRemoveMessage message) {
        // No fields to write
    }
}
