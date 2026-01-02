package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.UpdateMessage;

/**
 * Composes Update packet for client.
 */
public class UpdateComposer extends PacketComposer<UpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_UPDATE_MESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, UpdateMessage message) {
        packet.appendInt(message.groupId());
        packet.appendInt(message.threadId());
    }
}
