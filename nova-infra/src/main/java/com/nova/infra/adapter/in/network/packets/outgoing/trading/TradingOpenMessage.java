package com.nova.infra.adapter.in.network.packets.outgoing.trading;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingOpenMessage(
    int reason,
    String otherUserName
) implements IOutgoingPacket {}
