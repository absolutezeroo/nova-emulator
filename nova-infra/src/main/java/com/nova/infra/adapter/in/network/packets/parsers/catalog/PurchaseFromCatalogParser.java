package com.nova.infra.adapter.in.network.packets.parsers.catalog;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.catalog.PurchaseFromCatalogMessageEvent;

/**
 * Parses PurchaseFromCatalog packet from client.
 */
public class PurchaseFromCatalogParser extends PacketParser<PurchaseFromCatalogMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CATALOG_PURCHASE;
    }

    @Override
    public PurchaseFromCatalogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseFromCatalogMessageEvent();
    }
}
