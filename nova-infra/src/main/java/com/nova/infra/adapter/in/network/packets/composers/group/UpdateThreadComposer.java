package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.UpdateThreadMessage;

/**
 * Composes UpdateThread packet for client.
 */
public class UpdateThreadComposer extends PacketComposer<UpdateThreadMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_UPDATE_THREAD;
    }

    @Override
    protected void write(PacketBuffer packet, UpdateThreadMessage message) {
        packet.appendInt(message.groupId());
    }
}
