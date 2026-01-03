package com.nova.infra.adapter.network.packets.outgoing.trading;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingOpenFailedMessage(
    int reason,
    String otherUserName
) implements OutgoingPacket {}
