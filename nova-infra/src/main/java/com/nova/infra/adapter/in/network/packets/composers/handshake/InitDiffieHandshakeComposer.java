package com.nova.infra.adapter.in.network.packets.composers.handshake;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.InitDiffieHandshakeMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes InitDiffieHandshake packet for client.
 */
@ComposesPacket(Outgoing.HANDSHAKE_INIT_DIFFIE)
public class InitDiffieHandshakeComposer extends PacketComposer<InitDiffieHandshakeMessage> {
@Override
    protected void write(PacketBuffer packet, InitDiffieHandshakeMessage message) {
        packet.appendString(message.encryptedPrime());
        packet.appendString(message.encryptedGenerator());
    }
}
