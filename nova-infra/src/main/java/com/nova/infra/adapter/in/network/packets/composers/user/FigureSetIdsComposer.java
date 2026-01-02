package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FigureSetIdsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FigureSetIds packet for client.
 */
@ComposesPacket(Outgoing.USER_CLOTHING)
public class FigureSetIdsComposer extends PacketComposer<FigureSetIdsMessage> {
@Override
    protected void write(PacketBuffer packet, FigureSetIdsMessage message) {
        // No fields to write
    }
}
