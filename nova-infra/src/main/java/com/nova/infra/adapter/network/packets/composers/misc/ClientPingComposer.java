package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ClientPingMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ClientPing packet for client.
 */
@ComposesPacket(Outgoing.CLIENT_PING)
public class ClientPingComposer extends PacketComposer<ClientPingMessage> {
@Override
    protected void write(PacketBuffer packet, ClientPingMessage message) {
        // No fields to write
    }
}
