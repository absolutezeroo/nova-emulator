package com.nova.infra.adapter.network.packets.incoming.marketplace;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record GetMarketplaceOffersMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
