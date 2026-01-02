package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ConnectionErrorMessage;

/**
 * Composes ConnectionError packet for client.
 */
public class ConnectionErrorComposer extends PacketComposer<ConnectionErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CONNECTION_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, ConnectionErrorMessage message) {
        packet.appendInt(message.messageId());
        packet.appendInt(message.errorCode());
        packet.appendString(message.timestamp());
    }
}
