package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.PurchaseFromCatalogMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchaseFromCatalog packet from client.
 */
@ParsesPacket(Incoming.CATALOG_PURCHASE)
public class PurchaseFromCatalogParser extends PacketParser<PurchaseFromCatalogMessageEvent> {
@Override
    public PurchaseFromCatalogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseFromCatalogMessageEvent();
    }
}
