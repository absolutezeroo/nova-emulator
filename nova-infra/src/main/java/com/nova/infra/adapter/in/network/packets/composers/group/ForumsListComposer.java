package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.ForumsListMessage;

/**
 * Composes ForumsList packet for client.
 */
public class ForumsListComposer extends PacketComposer<ForumsListMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, ForumsListMessage message) {
        packet.appendInt(message.listCode());
        packet.appendInt(message.totalAmount());
        packet.appendInt(message.startIndex());
        packet.appendInt(message.amount());
    }
}
