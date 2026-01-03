package com.nova.infra.adapter.network.packets.composers.navigator;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.navigator.NavigatorLiftedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes NavigatorLifted packet for client.
 */
@ComposesPacket(Outgoing.NAVIGATOR_LIFTED)
public class NavigatorLiftedComposer extends PacketComposer<NavigatorLiftedMessage> {
@Override
    protected void write(PacketBuffer packet, NavigatorLiftedMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.areaId());
        packet.appendString(message.image());
        packet.appendString(message.caption());
    }
}
