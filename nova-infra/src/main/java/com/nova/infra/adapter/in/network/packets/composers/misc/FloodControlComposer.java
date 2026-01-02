package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FloodControlMessage;

/**
 * Composes FloodControl packet for client.
 */
public class FloodControlComposer extends PacketComposer<FloodControlMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FLOOD_CONTROL;
    }

    @Override
    protected void write(PacketBuffer packet, FloodControlMessage message) {
        packet.appendInt(message.seconds());
    }
}
