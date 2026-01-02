package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.MiniMailUnreadCountMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes MiniMailUnreadCount packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_MINIMAIL_COUNT)
public class MiniMailUnreadCountComposer extends PacketComposer<MiniMailUnreadCountMessage> {
@Override
    protected void write(PacketBuffer packet, MiniMailUnreadCountMessage message) {
        packet.appendInt(message.count());
    }
}
