package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.UnreadForumsCountMessage;

/**
 * Composes UnreadForumsCount packet for client.
 */
public class UnreadForumsCountComposer extends PacketComposer<UnreadForumsCountMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_UNREAD_COUNT;
    }

    @Override
    protected void write(PacketBuffer packet, UnreadForumsCountMessage message) {
        packet.appendInt(message.count());
    }
}
