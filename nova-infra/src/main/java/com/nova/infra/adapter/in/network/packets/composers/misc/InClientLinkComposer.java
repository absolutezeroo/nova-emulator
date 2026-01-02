package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.InClientLinkMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes InClientLink packet for client.
 */
@ComposesPacket(Outgoing.IN_CLIENT_LINK)
public class InClientLinkComposer extends PacketComposer<InClientLinkMessage> {
@Override
    protected void write(PacketBuffer packet, InClientLinkMessage message) {
        packet.appendString(message.link());
    }
}
