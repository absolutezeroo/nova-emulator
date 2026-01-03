package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CatalogPageMessage(
    int pageId,
    String pageName,
    int secondsToExpiry,
    String image
) implements IOutgoingPacket {}
