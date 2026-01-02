package com.nova.infra.adapter.in.network.packets.composers.recycler;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.recycler.RecyclerStatusMessage;

/**
 * Composes RecyclerStatus packet for client.
 */
public class RecyclerStatusComposer extends PacketComposer<RecyclerStatusMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.RECYCLER_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, RecyclerStatusMessage message) {
        packet.appendInt(message.recyclerStatus());
        packet.appendInt(message.recyclerTimeoutSeconds());
    }
}
