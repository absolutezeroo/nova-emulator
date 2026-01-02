package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LeftQueueMessage;

/**
 * Composes LeftQueue packet for client.
 */
public class LeftQueueComposer extends PacketComposer<LeftQueueMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.LEFTQUEUE;
    }

    @Override
    protected void write(PacketBuffer packet, LeftQueueMessage message) {
        packet.appendInt(message.gameTypeId());
    }
}
