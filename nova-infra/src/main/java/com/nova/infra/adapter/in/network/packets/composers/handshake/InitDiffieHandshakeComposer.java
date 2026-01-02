package com.nova.infra.adapter.in.network.packets.composers.handshake;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.InitDiffieHandshakeMessage;

/**
 * Composes InitDiffieHandshake packet for client.
 */
public class InitDiffieHandshakeComposer extends PacketComposer<InitDiffieHandshakeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HANDSHAKE_INIT_DIFFIE;
    }

    @Override
    protected void write(PacketBuffer packet, InitDiffieHandshakeMessage message) {
        packet.appendString(message.encryptedPrime());
        packet.appendString(message.encryptedGenerator());
    }
}
