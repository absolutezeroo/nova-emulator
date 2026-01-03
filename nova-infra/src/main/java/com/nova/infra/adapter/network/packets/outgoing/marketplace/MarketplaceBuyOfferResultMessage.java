package com.nova.infra.adapter.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceBuyOfferResultMessage(
    int result,
    int newOfferId,
    int newPrice,
    int requestedOfferId
) implements IOutgoingPacket {}
