package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.UnreadForumsCountMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UnreadForumsCount packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_UNREAD_COUNT)
public class UnreadForumsCountComposer extends PacketComposer<UnreadForumsCountMessage> {
@Override
    protected void write(PacketBuffer packet, UnreadForumsCountMessage message) {
        packet.appendInt(message.count());
    }
}
