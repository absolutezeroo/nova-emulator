package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.PurchaseTargetedOfferMessageEvent;

/**
 * Parses PurchaseTargetedOffer packet from client.
 */
public class PurchaseTargetedOfferParser extends PacketParser<PurchaseTargetedOfferMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.PURCHASE_TARGETED_OFFER;
    }

    @Override
    public PurchaseTargetedOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseTargetedOfferMessageEvent();
    }
}
