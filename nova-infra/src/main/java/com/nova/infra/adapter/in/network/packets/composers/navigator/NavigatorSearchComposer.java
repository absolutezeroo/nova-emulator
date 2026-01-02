package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorSearchMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorSearch packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_SEARCH)
public class NavigatorSearchComposer extends PacketComposer<NavigatorSearchMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorSearchMessage message) {
        packet.appendString(message.code());
        packet.appendString(message.data());
        packet.appendInt(message.action());
        packet.appendBoolean(message.closed());
        packet.appendInt(message.mode());
    }
}
