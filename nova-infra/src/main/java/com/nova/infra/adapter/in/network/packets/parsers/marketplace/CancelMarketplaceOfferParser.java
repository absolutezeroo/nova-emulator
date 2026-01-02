package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.CancelMarketplaceOfferMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses CancelMarketplaceOffer packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_TAKE_BACK_ITEM)
public class CancelMarketplaceOfferParser extends PacketParser<CancelMarketplaceOfferMessageEvent> {
@Override
    public CancelMarketplaceOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new CancelMarketplaceOfferMessageEvent();
    }
}
