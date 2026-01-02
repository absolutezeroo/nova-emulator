package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LeftQueueMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes LeftQueue packet for client.
 */
@ComposesPacket(Outgoing.LEFTQUEUE)
public class LeftQueueComposer extends PacketComposer<LeftQueueMessage> {
@Override
    protected void write(PacketBuffer packet, LeftQueueMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
