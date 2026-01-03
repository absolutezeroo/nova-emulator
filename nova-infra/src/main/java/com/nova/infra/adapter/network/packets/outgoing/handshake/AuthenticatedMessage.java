package com.nova.infra.adapter.network.packets.outgoing.handshake;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AuthenticatedMessage() implements IOutgoingPacket {}
