package com.nova.infra.adapter.network.packets.composers.user;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.user.FigureUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FigureUpdate packet for client.
 */
@ComposesPacket(Outgoing.USER_FIGURE)
public class FigureUpdateComposer extends PacketComposer<FigureUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, FigureUpdateMessage message) {
        packet.appendString(message.figure());
        packet.appendString(message.gender());
    }
}
