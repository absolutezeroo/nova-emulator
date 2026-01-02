package com.nova.infra.adapter.in.network.packets.composers.handshake;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.handshake.CompleteDiffieHandshakeMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CompleteDiffieHandshake packet for client.
 */
@ComposesPacket(Outgoing.HANDSHAKE_COMPLETE_DIFFIE)
public class CompleteDiffieHandshakeComposer extends PacketComposer<CompleteDiffieHandshakeMessage> {
@Override
    protected void write(PacketBuffer packet, CompleteDiffieHandshakeMessage message) {
        packet.appendString(message.encryptedPublicKey());
        packet.appendBoolean(message.serverClientEncryption());
    }
}
