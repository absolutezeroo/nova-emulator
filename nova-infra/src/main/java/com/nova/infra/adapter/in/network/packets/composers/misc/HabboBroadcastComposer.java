package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HabboBroadcastMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes HabboBroadcast packet for client.
 */
@ComposesPacket(Outgoing.GENERIC_ALERT)
public class HabboBroadcastComposer extends PacketComposer<HabboBroadcastMessage> {
@Override
    protected void write(PacketBuffer packet, HabboBroadcastMessage message) {
        packet.appendString(message.message());
    }
}
