package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.ForumsListMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ForumsList packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_LIST)
public class ForumsListComposer extends PacketComposer<ForumsListMessage> {
@Override
    protected void write(PacketBuffer packet, ForumsListMessage message) {
        packet.appendInt(message.listCode());
        packet.appendInt(message.totalAmount());
        packet.appendInt(message.startIndex());
        packet.appendInt(message.amount());
    }
}
