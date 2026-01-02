package com.nova.infra.adapter.in.network.packets.outgoing.trading;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record TradingListItemMessage(
    int firstUserID,
    int firstUserNumItems,
    int firstUserNumCredits,
    int secondUserID,
    int secondUserNumItems,
    int secondUserNumCredits
) implements IOutgoingPacket {}
