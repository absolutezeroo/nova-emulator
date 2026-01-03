package com.nova.infra.adapter.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceItemStatsMessage(
    int averagePrice,
    int currentOfferCount,
    int historyLength
) implements OutgoingPacket {}
