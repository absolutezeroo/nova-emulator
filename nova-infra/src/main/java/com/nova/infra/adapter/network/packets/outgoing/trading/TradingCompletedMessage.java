package com.nova.infra.adapter.network.packets.outgoing.trading;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingCompletedMessage(
    // No fields parsed
) implements OutgoingPacket {}
