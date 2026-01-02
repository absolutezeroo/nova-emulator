package com.nova.infra.adapter.in.network.packets.incoming.marketplace;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record GetMarketplaceConfigurationMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
