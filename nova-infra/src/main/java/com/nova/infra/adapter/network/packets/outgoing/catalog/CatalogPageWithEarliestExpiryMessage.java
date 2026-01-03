package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CatalogPageWithEarliestExpiryMessage(
    String pageName,
    int secondsToExpiry,
    String image
) implements IOutgoingPacket {}
