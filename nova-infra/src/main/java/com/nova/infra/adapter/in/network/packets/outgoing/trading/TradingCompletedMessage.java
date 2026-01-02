package com.nova.infra.adapter.in.network.packets.outgoing.trading;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingCompletedMessage(
    // No fields parsed
) implements IOutgoingPacket {}
