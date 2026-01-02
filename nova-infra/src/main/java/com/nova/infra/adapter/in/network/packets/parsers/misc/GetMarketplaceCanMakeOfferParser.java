package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetMarketplaceCanMakeOfferMessageEvent;

/**
 * Parses GetMarketplaceCanMakeOffer packet from client.
 */
public class GetMarketplaceCanMakeOfferParser extends PacketParser<GetMarketplaceCanMakeOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REQUEST_SELL_ITEM;
    }

    @Override
    public GetMarketplaceCanMakeOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceCanMakeOfferMessageEvent();
    }
}
