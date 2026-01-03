package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record ConnectionErrorMessage(
    int messageId,
    int errorCode,
    String timestamp
) implements OutgoingPacket {}
