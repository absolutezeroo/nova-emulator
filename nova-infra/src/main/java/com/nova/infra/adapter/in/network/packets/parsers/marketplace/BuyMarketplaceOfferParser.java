package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.BuyMarketplaceOfferMessageEvent;

/**
 * Parses BuyMarketplaceOffer packet from client.
 */
public class BuyMarketplaceOfferParser extends PacketParser<BuyMarketplaceOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_BUY_OFFER;
    }

    @Override
    public BuyMarketplaceOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuyMarketplaceOfferMessageEvent();
    }
}
