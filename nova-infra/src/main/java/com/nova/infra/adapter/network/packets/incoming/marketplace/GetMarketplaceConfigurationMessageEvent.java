package com.nova.infra.adapter.network.packets.incoming.marketplace;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record GetMarketplaceConfigurationMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
