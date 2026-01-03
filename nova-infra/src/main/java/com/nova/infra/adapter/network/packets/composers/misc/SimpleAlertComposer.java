package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.SimpleAlertMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes SimpleAlert packet for client.
 */
@ComposesPacket(Outgoing.NOTIFICATION_SIMPLE_ALERT)
public class SimpleAlertComposer extends PacketComposer<SimpleAlertMessage> {
@Override
    protected void write(PacketBuffer packet, SimpleAlertMessage message) {
        packet.appendString(message.alertMessage());
        packet.appendString(message.titleMessage());
    }
}
