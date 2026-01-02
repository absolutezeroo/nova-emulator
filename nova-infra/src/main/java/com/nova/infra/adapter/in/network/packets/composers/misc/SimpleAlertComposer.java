package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.SimpleAlertMessage;

/**
 * Composes SimpleAlert packet for client.
 */
public class SimpleAlertComposer extends PacketComposer<SimpleAlertMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.NOTIFICATION_SIMPLE_ALERT;
    }

    @Override
    protected void write(PacketBuffer packet, SimpleAlertMessage message) {
        packet.appendString(message.alertMessage());
        packet.appendString(message.titleMessage());
    }
}
