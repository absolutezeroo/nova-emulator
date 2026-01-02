package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FigureSetIdsMessage;

/**
 * Composes FigureSetIds packet for client.
 */
public class FigureSetIdsComposer extends PacketComposer<FigureSetIdsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_CLOTHING;
    }

    @Override
    protected void write(PacketBuffer packet, FigureSetIdsMessage message) {
        // No fields to write
    }
}
