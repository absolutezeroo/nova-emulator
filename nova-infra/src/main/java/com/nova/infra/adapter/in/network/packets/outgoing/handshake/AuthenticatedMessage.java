package com.nova.infra.adapter.in.network.packets.outgoing.handshake;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message indicating successful authentication.
 * <p>
 * Sent to client as packet ID 2491 (AUTH_OK).
 * This is an empty packet - just the header indicates success.
 */
public record AuthenticatedMessage() implements IOutgoingPacket {

    /**
     * Singleton instance since this message has no data.
     */
    public static final AuthenticatedMessage INSTANCE = new AuthenticatedMessage();
}
