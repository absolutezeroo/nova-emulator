package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.MakeOfferMessageEvent;

/**
 * Parses MakeOffer packet from client.
 */
public class MakeOfferParser extends PacketParser<MakeOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_SELL_ITEM;
    }

    @Override
    public MakeOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MakeOfferMessageEvent();
    }
}
