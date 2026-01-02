package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredOpenMessage;

/**
 * Composes WiredOpen packet for client.
 */
public class WiredOpenComposer extends PacketComposer<WiredOpenMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.WIRED_OPEN;
    }

    @Override
    protected void write(PacketBuffer packet, WiredOpenMessage message) {
        packet.appendInt(message.stuffId());
    }
}
