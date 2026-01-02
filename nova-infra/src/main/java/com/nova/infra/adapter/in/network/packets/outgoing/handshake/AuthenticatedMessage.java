package com.nova.infra.adapter.in.network.packets.outgoing.handshake;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record AuthenticatedMessage() implements IOutgoingPacket {}
