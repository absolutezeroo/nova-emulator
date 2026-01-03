package com.nova.infra.adapter.network.packets.outgoing.marketplace;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record MarketplaceConfigurationMessage(
    boolean enabled,
    int commission,
    int credits,
    int advertisements,
    int minimumPrice,
    int maximumPrice,
    int offerTime,
    int displayTime
) implements OutgoingPacket {}
