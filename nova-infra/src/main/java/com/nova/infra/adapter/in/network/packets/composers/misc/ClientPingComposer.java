package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ClientPingMessage;

/**
 * Composes ClientPing packet for client.
 */
public class ClientPingComposer extends PacketComposer<ClientPingMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CLIENT_PING;
    }

    @Override
    protected void write(PacketBuffer packet, ClientPingMessage message) {
        // No fields to write
    }
}
