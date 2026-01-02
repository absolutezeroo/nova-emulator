package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.JoinedQueueMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes JoinedQueue packet for client.
 */
@ComposesPacket(Outgoing.JOINEDQUEUEMESSAGE)
public class JoinedQueueComposer extends PacketComposer<JoinedQueueMessage> {
@Override
    protected void write(PacketBuffer packet, JoinedQueueMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
