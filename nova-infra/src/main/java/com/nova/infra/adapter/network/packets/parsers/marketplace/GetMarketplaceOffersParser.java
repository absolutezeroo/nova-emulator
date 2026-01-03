package com.nova.infra.adapter.network.packets.parsers.marketplace;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.marketplace.GetMarketplaceOffersMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetMarketplaceOffers packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_REQUEST_OFFERS)
public class GetMarketplaceOffersParser extends PacketParser<GetMarketplaceOffersMessageEvent> {
@Override
    public GetMarketplaceOffersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceOffersMessageEvent();
    }
}
