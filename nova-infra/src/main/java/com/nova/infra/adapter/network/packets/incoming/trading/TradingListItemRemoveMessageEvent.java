package com.nova.infra.adapter.network.packets.incoming.trading;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record TradingListItemRemoveMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
