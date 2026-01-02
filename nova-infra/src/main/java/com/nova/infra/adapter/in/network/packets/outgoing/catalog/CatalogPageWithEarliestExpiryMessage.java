package com.nova.infra.adapter.in.network.packets.outgoing.catalog;

import com.nova.infra.adapter.in.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CatalogPageWithEarliestExpiryMessage(
    String pageName,
    int secondsToExpiry,
    String image
) implements IOutgoingPacket {}
