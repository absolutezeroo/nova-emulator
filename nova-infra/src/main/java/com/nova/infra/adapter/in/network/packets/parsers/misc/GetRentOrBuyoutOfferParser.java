package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetRentOrBuyoutOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
