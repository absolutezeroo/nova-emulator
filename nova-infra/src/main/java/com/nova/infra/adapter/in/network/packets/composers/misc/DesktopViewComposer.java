package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.DesktopViewMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes DesktopView packet for client.
 */
@ComposesPacket(Outgoing.DESKTOP_VIEW)
public class DesktopViewComposer extends PacketComposer<DesktopViewMessage> {
@Override
    protected void write(PacketBuffer packet, DesktopViewMessage message) {
        // No fields to write
    }
}
