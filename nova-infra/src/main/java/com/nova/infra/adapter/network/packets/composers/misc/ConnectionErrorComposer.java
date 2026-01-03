package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ConnectionErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ConnectionError packet for client.
 */
@ComposesPacket(Outgoing.CONNECTION_ERROR)
public class ConnectionErrorComposer extends PacketComposer<ConnectionErrorMessage> {
@Override
    protected void write(PacketBuffer packet, ConnectionErrorMessage message) {
        packet.appendInt(message.messageId());
        packet.appendInt(message.errorCode());
        packet.appendString(message.timestamp());
    }
}
