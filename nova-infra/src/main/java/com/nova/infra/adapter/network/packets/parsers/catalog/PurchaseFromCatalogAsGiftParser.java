package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.PurchaseFromCatalogAsGiftMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchaseFromCatalogAsGift packet from client.
 */
@ParsesPacket(Incoming.CATALOG_PURCHASE_GIFT)
public class PurchaseFromCatalogAsGiftParser extends PacketParser<PurchaseFromCatalogAsGiftMessageEvent> {
@Override
    public PurchaseFromCatalogAsGiftMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseFromCatalogAsGiftMessageEvent();
    }
}
