package com.nova.infra.adapter.in.network.packets.composers.user;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.user.FigureUpdateMessage;

/**
 * Composes FigureUpdate packet for client.
 */
public class FigureUpdateComposer extends PacketComposer<FigureUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.USER_FIGURE;
    }

    @Override
    protected void write(PacketBuffer packet, FigureUpdateMessage message) {
        packet.appendString(message.figure());
        packet.appendString(message.gender());
    }
}
