package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.JoinedQueueMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
