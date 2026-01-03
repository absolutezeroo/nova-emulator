package com.nova.infra.adapter.network.packets.outgoing.user;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record RespectReceivedMessage(
    int userId,
    int respectsReceived
) implements OutgoingPacket {}
