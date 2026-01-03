package com.nova.infra.adapter.network.packets.outgoing.trading;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingOtherNotAllowedMessage(
    // No fields parsed
) implements IOutgoingPacket {}
