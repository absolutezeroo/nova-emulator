package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record InstantMessageErrorMessage(
    int errorCode,
    int userId,
    String message
) implements IOutgoingPacket {}
