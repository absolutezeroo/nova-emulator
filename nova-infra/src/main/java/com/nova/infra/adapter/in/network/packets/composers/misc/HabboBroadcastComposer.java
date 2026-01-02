package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.HabboBroadcastMessage;

/**
 * Composes HabboBroadcast packet for client.
 */
public class HabboBroadcastComposer extends PacketComposer<HabboBroadcastMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GENERIC_ALERT;
    }

    @Override
    protected void write(PacketBuffer packet, HabboBroadcastMessage message) {
        packet.appendString(message.message());
    }
}
