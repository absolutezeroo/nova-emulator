package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.LeftQueueMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
