package com.nova.infra.adapter.network.packets.outgoing.messenger;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record NewConsoleMessage(
    int senderId,
    String messageText,
    int secondsSinceSent,
    String extraData
) implements IOutgoingPacket {}
