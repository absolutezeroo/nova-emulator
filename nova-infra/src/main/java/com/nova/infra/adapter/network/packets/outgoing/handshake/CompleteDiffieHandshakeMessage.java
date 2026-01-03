package com.nova.infra.adapter.network.packets.outgoing.handshake;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CompleteDiffieHandshakeMessage(
    String encryptedPublicKey,
    boolean serverClientEncryption
) implements OutgoingPacket {}
