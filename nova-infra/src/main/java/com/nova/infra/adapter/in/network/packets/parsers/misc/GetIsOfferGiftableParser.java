package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetIsOfferGiftableMessageEvent;

/**
 * Parses GetIsOfferGiftable packet from client.
 */
public class GetIsOfferGiftableParser extends PacketParser<GetIsOfferGiftableMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_IS_OFFER_GIFTABLE;
    }

    @Override
    public GetIsOfferGiftableMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetIsOfferGiftableMessageEvent();
    }
}
