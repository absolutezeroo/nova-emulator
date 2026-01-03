package com.nova.infra.adapter.network.packets.outgoing.trading;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingYouAreNotAllowedMessage(
    // No fields parsed
) implements OutgoingPacket {}
