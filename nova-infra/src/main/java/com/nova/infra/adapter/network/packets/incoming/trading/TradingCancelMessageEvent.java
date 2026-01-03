package com.nova.infra.adapter.network.packets.incoming.trading;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record TradingCancelMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
