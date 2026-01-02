package com.nova.infra.adapter.in.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceItemStatsMessage(
    int averagePrice,
    int currentOfferCount,
    int historyLength
) implements IOutgoingPacket {}
