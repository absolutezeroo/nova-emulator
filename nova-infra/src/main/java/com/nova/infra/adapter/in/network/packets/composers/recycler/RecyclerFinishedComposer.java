package com.nova.infra.adapter.in.network.packets.composers.recycler;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.recycler.RecyclerFinishedMessage;

/**
 * Composes RecyclerFinished packet for client.
 */
public class RecyclerFinishedComposer extends PacketComposer<RecyclerFinishedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.RECYCLER_FINISHED;
    }

    @Override
    protected void write(PacketBuffer packet, RecyclerFinishedMessage message) {
        packet.appendInt(message.recyclerFinishedStatus());
        packet.appendInt(message.prizeId());
    }
}
