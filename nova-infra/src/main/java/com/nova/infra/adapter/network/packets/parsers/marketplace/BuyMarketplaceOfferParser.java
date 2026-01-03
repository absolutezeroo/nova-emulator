package com.nova.infra.adapter.network.packets.parsers.marketplace;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.marketplace.BuyMarketplaceOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses BuyMarketplaceOffer packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_BUY_OFFER)
public class BuyMarketplaceOfferParser extends PacketParser<BuyMarketplaceOfferMessageEvent> {
@Override
    public BuyMarketplaceOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuyMarketplaceOfferMessageEvent();
    }
}
