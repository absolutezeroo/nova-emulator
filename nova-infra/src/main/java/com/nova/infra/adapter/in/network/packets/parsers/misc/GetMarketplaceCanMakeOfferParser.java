package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetMarketplaceCanMakeOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetMarketplaceCanMakeOffer packet from client.
 */
@ParsesPacket(Incoming.REQUEST_SELL_ITEM)
public class GetMarketplaceCanMakeOfferParser extends PacketParser<GetMarketplaceCanMakeOfferMessageEvent> {
@Override
    public GetMarketplaceCanMakeOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceCanMakeOfferMessageEvent();
    }
}
