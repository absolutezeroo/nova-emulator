package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.PurchaseTargetedOfferMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses PurchaseTargetedOffer packet from client.
 */
@ParsesPacket(Incoming.PURCHASE_TARGETED_OFFER)
public class PurchaseTargetedOfferParser extends PacketParser<PurchaseTargetedOfferMessageEvent> {
@Override
    public PurchaseTargetedOfferMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new PurchaseTargetedOfferMessageEvent();
    }
}
