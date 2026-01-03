package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetRentOrBuyoutOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRentOrBuyoutOffer packet from client.
 */
@ParsesPacket(Incoming.RENTABLE_GET_RENT_OR_BUYOUT_OFFER)
public class GetRentOrBuyoutOfferParser extends PacketParser<GetRentOrBuyoutOfferMessageEvent> {
@Override
    public GetRentOrBuyoutOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRentOrBuyoutOfferMessageEvent();
    }
}
