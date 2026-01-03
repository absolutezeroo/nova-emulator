package com.nova.infra.adapter.network.packets.composers.wired;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.wired.WiredOpenMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
