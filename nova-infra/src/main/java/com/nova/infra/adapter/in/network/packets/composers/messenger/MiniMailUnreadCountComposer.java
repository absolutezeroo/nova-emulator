package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.MiniMailUnreadCountMessage;

/**
 * Composes MiniMailUnreadCount packet for client.
 */
public class MiniMailUnreadCountComposer extends PacketComposer<MiniMailUnreadCountMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MESSENGER_MINIMAIL_COUNT;
    }

    @Override
    protected void write(PacketBuffer packet, MiniMailUnreadCountMessage message) {
        packet.appendInt(message.count());
    }
}
