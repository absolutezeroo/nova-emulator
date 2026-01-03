package com.nova.infra.adapter.network.packets.composers.recycler;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.recycler.RecyclerStatusMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RecyclerStatus packet for client.
 */
@ComposesPacket(Outgoing.RECYCLER_STATUS)
public class RecyclerStatusComposer extends PacketComposer<RecyclerStatusMessage> {
@Override
    protected void write(PacketBuffer packet, RecyclerStatusMessage message) {
        packet.appendInt(message.recyclerStatus());
        packet.appendInt(message.recyclerTimeoutSeconds());
    }
}
