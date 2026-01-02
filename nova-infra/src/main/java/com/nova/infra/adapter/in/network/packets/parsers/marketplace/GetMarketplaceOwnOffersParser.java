package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.GetMarketplaceOwnOffersMessageEvent;

/**
 * Parses GetMarketplaceOwnOffers packet from client.
 */
public class GetMarketplaceOwnOffersParser extends PacketParser<GetMarketplaceOwnOffersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_REQUEST_OWN_ITEMS;
    }

    @Override
    public GetMarketplaceOwnOffersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceOwnOffersMessageEvent();
    }
}
