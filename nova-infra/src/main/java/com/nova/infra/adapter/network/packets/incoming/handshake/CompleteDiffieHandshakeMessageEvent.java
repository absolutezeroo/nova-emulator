package com.nova.infra.adapter.network.packets.incoming.handshake;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record CompleteDiffieHandshakeMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
