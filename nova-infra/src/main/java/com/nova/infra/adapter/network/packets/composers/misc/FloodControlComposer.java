package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FloodControlMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
