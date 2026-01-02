package com.nova.infra.adapter.in.network.packets.composers.navigator;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.navigator.NavigatorLiftedMessage;

/**
 * Composes NavigatorLifted packet for client.
 */
public class NavigatorLiftedComposer extends PacketComposer<NavigatorLiftedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NAVIGATOR_LIFTED;
    }

    @Override
    protected void write(PacketBuffer packet, NavigatorLiftedMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.areaId());
        packet.appendString(message.image());
        packet.appendString(message.caption());
    }
}
