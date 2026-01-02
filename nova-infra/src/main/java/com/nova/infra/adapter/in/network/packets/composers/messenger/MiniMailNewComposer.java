package com.nova.infra.adapter.in.network.packets.composers.messenger;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.messenger.MiniMailNewMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes MiniMailNew packet for client.
 */
@ComposesPacket(Outgoing.MESSENGER_MINIMAIL_NEW)
public class MiniMailNewComposer extends PacketComposer<MiniMailNewMessage> {
@Override
    protected void write(PacketBuffer packet, MiniMailNewMessage message) {
        // No fields to write
    }
}
