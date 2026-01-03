package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.HabboBroadcastMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
