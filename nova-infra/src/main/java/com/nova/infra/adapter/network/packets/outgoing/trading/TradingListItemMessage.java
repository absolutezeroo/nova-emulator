package com.nova.infra.adapter.network.packets.outgoing.trading;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

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
) implements OutgoingPacket {}
