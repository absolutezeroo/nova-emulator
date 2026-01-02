package com.nova.infra.adapter.in.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceOwnOffersMessage(
    int creditsWaiting
) implements IOutgoingPacket {}
