package com.nova.infra.adapter.network.packets.composers.navigator;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.navigator.NavigatorSearchesMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorSearches packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_SEARCHES)
public class NavigatorSearchesComposer extends PacketComposer<NavigatorSearchesMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorSearchesMessage message) {
        // No fields to write
    }
}
