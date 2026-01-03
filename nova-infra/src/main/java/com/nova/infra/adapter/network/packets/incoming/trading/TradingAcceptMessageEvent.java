package com.nova.infra.adapter.network.packets.incoming.trading;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record TradingAcceptMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
