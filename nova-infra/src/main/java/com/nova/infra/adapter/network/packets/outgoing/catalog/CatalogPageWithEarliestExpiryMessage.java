package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CatalogPageWithEarliestExpiryMessage(
    String pageName,
    int secondsToExpiry,
    String image
) implements OutgoingPacket {}
