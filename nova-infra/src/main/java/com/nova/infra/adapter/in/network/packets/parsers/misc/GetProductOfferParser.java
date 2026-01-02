package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetProductOfferMessageEvent;

/**
 * Parses GetProductOffer packet from client.
 */
public class GetProductOfferParser extends PacketParser<GetProductOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_PRODUCT_OFFER;
    }

    @Override
    public GetProductOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetProductOfferMessageEvent();
    }
}
