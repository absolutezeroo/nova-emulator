package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.ShopTargetedOfferViewedMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
