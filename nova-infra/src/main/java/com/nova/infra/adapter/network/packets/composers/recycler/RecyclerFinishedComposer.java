package com.nova.infra.adapter.network.packets.composers.recycler;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.recycler.RecyclerFinishedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RecyclerFinished packet for client.
 */
@ComposesPacket(Outgoing.RECYCLER_FINISHED)
public class RecyclerFinishedComposer extends PacketComposer<RecyclerFinishedMessage> {
@Override
    protected void write(PacketBuffer packet, RecyclerFinishedMessage message) {
        packet.appendInt(message.recyclerFinishedStatus());
        packet.appendInt(message.prizeId());
    }
}
