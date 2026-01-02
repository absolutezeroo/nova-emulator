package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FloodControlMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FloodControl packet for client.
 */
@ComposesPacket(Outgoing.FLOOD_CONTROL)
public class FloodControlComposer extends PacketComposer<FloodControlMessage> {
@Override
    protected void write(PacketBuffer packet, FloodControlMessage message) {
        packet.appendInt(message.seconds());
    }
}
