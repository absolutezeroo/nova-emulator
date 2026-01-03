package com.nova.infra.adapter.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceCanMakeOfferResultMessage(
    int result,
    int tokenCount
) implements IOutgoingPacket {}
