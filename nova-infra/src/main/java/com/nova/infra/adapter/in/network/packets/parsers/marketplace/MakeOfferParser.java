package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.MakeOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses MakeOffer packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_SELL_ITEM)
public class MakeOfferParser extends PacketParser<MakeOfferMessageEvent> {
@Override
    public MakeOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new MakeOfferMessageEvent();
    }
}
