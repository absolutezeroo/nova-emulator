package com.nova.infra.adapter.network.packets.composers.navigator;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.navigator.NavigatorCollapsedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorCollapsed packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_COLLAPSED)
public class NavigatorCollapsedComposer extends PacketComposer<NavigatorCollapsedMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorCollapsedMessage message) {
        // No fields to write
    }
}
