package com.nova.infra.adapter.network.packets.incoming.catalog;

import com.nova.infra.adapter.network.packets.IncomingPacket;

/**
 * Event received from client.
 */
public record PurchaseFromCatalogMessageEvent(
    // No fields parsed
) implements IncomingPacket {}
