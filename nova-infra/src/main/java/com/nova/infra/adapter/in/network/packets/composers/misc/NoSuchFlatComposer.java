package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.NoSuchFlatMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes NoSuchFlat packet for client.
 */
@ComposesPacket(Outgoing.NO_SUCH_FLAT)
public class NoSuchFlatComposer extends PacketComposer<NoSuchFlatMessage> {
@Override
    protected void write(PacketBuffer packet, NoSuchFlatMessage message) {
        packet.appendInt(message.roomId());
    }
}
