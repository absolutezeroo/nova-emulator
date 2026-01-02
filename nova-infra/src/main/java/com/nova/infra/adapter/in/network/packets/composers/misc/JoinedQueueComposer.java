package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.JoinedQueueMessage;

/**
 * Composes JoinedQueue packet for client.
 */
public class JoinedQueueComposer extends PacketComposer<JoinedQueueMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.JOINEDQUEUEMESSAGE;
    }

    @Override
    protected void write(PacketBuffer packet, JoinedQueueMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
