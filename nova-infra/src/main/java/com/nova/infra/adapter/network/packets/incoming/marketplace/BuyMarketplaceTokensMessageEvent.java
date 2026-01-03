package com.nova.infra.adapter.network.packets.incoming.marketplace;

import com.nova.infra.adapter.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record BuyMarketplaceTokensMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
