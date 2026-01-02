package com.nova.infra.adapter.in.network.packets.incoming.trading;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record TradingAcceptMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
