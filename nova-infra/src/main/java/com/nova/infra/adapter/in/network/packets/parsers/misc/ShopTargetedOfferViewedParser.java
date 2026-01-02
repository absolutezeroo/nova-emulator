package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.ShopTargetedOfferViewedMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses ShopTargetedOfferViewed packet from client.
 */
@ParsesPacket(Incoming.SHOP_TARGETED_OFFER_VIEWED)
public class ShopTargetedOfferViewedParser extends PacketParser<ShopTargetedOfferViewedMessageEvent> {
@Override
    public ShopTargetedOfferViewedMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new ShopTargetedOfferViewedMessageEvent();
    }
}
