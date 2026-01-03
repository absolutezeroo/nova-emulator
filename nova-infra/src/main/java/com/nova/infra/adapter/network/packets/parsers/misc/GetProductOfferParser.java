package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetProductOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
