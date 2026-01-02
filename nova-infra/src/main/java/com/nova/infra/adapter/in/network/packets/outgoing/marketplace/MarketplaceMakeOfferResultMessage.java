package com.nova.infra.adapter.in.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceMakeOfferResultMessage(
    // No fields parsed
) implements IOutgoingPacket {}
