package com.nova.infra.adapter.network.packets.incoming.handshake;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record CompleteDiffieHandshakeMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
