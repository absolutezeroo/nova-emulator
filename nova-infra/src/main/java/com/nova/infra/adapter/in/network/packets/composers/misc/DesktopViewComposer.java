package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.DesktopViewMessage;

/**
 * Composes DesktopView packet for client.
 */
public class DesktopViewComposer extends PacketComposer<DesktopViewMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.DESKTOP_VIEW;
    }

    @Override
    protected void write(PacketBuffer packet, DesktopViewMessage message) {
        // No fields to write
    }
}
