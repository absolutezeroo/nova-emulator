package com.nova.infra.adapter.in.network.packets.composers.wired;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.wired.WiredOpenMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes WiredOpen packet for client.
 */
@ComposesPacket(Outgoing.WIRED_OPEN)
public class WiredOpenComposer extends PacketComposer<WiredOpenMessage> {
@Override
    protected void write(PacketBuffer packet, WiredOpenMessage message) {
        packet.appendInt(message.stuffId());
    }
}
