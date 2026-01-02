package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorSearchesMessage;

/**
 * Composes NavigatorSearches packet for client.
 */
public class NavigatorSearchesComposer extends PacketComposer<NavigatorSearchesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_SEARCHES;
    }

    @Override
    protected void write(PacketBuffer packet, NavigatorSearchesMessage message) {
        // No fields to write
    }
}
