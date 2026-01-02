package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.GetMarketplaceOffersMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
