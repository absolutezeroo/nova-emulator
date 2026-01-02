package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.CancelMarketplaceOfferMessageEvent;

/**
 * Parses CancelMarketplaceOffer packet from client.
 */
public class CancelMarketplaceOfferParser extends PacketParser<CancelMarketplaceOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_TAKE_BACK_ITEM;
    }

    @Override
    public CancelMarketplaceOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CancelMarketplaceOfferMessageEvent();
    }
}
