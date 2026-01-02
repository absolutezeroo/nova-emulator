package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorCollapsedMessage;

/**
 * Composes NavigatorCollapsed packet for client.
 */
public class NavigatorCollapsedComposer extends PacketComposer<NavigatorCollapsedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_COLLAPSED;
    }

    @Override
    protected void write(PacketBuffer packet, NavigatorCollapsedMessage message) {
        // No fields to write
    }
}
