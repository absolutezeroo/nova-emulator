package com.nova.infra.adapter.in.network.packets.parsers.catalog;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.catalog.PurchaseFromCatalogAsGiftMessageEvent;

/**
 * Parses PurchaseFromCatalogAsGift packet from client.
 */
public class PurchaseFromCatalogAsGiftParser extends PacketParser<PurchaseFromCatalogAsGiftMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CATALOG_PURCHASE_GIFT;
    }

    @Override
    public PurchaseFromCatalogAsGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseFromCatalogAsGiftMessageEvent();
    }
}
