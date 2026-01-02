package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetProductOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetProductOffer packet from client.
 */
@ParsesPacket(Incoming.GET_PRODUCT_OFFER)
public class GetProductOfferParser extends PacketParser<GetProductOfferMessageEvent> {
@Override
    public GetProductOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetProductOfferMessageEvent();
    }
}
