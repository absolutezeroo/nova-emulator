package com.nova.infra.adapter.in.network.packets.incoming.handshake;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record InitDiffieHandshakeMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
