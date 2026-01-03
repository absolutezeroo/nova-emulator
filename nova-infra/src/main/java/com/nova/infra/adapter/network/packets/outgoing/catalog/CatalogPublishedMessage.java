package com.nova.infra.adapter.network.packets.outgoing.catalog;

import com.nova.infra.adapter.network.packets.OutgoingPacket;

/**
 * Message sent to client.
 */
public record CatalogPublishedMessage(
    boolean instantlyRefreshCatalogue,
    String newFurniDataHash
) implements OutgoingPacket {}
