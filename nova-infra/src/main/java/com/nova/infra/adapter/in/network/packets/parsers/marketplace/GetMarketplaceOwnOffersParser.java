package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.GetMarketplaceOwnOffersMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetMarketplaceOwnOffers packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_REQUEST_OWN_ITEMS)
public class GetMarketplaceOwnOffersParser extends PacketParser<GetMarketplaceOwnOffersMessageEvent> {
@Override
    public GetMarketplaceOwnOffersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceOwnOffersMessageEvent();
    }
}
