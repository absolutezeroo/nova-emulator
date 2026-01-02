package com.nova.infra.adapter.in.network.packets.composers.handshake;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.CompleteDiffieHandshakeMessage;

/**
 * Composes CompleteDiffieHandshake packet for client.
 */
public class CompleteDiffieHandshakeComposer extends PacketComposer<CompleteDiffieHandshakeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.HANDSHAKE_COMPLETE_DIFFIE;
    }

    @Override
    protected void write(PacketBuffer packet, CompleteDiffieHandshakeMessage message) {
        packet.appendString(message.encryptedPublicKey());
        packet.appendBoolean(message.serverClientEncryption());
    }
}
