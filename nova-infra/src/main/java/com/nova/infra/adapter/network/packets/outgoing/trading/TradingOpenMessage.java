package com.nova.infra.adapter.network.packets.outgoing.trading;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingOpenMessage(
    int reason,
    String otherUserName
) implements IOutgoingPacket {}
