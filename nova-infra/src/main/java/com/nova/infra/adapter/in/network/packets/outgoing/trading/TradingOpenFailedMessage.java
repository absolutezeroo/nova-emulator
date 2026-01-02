package com.nova.infra.adapter.in.network.packets.outgoing.trading;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingOpenFailedMessage(
    int reason,
    String otherUserName
) implements IOutgoingPacket {}
