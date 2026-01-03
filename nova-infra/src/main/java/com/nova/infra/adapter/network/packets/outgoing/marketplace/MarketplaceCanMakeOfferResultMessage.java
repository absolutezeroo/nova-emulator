package com.nova.infra.adapter.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceCanMakeOfferResultMessage(
    int result,
    int tokenCount
) implements OutgoingPacket {}
