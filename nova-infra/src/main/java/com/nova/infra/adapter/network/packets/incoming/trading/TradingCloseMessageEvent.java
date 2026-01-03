package com.nova.infra.adapter.network.packets.incoming.trading;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record TradingCloseMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
