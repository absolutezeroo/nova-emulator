package com.nova.infra.adapter.in.network.packets.incoming.catalog;

import com.nova.infra.adapter.in.network.packets.IIncomingPacket;

/**
 * Event received from client.
 */
public record PurchaseFromCatalogMessageEvent(
    // No fields parsed
) implements IIncomingPacket {}
