package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.InClientLinkMessage;

/**
 * Composes InClientLink packet for client.
 */
public class InClientLinkComposer extends PacketComposer<InClientLinkMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.IN_CLIENT_LINK;
    }

    @Override
    protected void write(PacketBuffer packet, InClientLinkMessage message) {
        packet.appendString(message.link());
    }
}
