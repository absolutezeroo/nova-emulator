package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketPlaceOffersMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes MarketPlaceOffers packet for client.
 */
@ComposesPacket(Outgoing.MARKETPLACE_ITEMS_SEARCHED)
public class MarketPlaceOffersComposer extends PacketComposer<MarketPlaceOffersMessage> {
@Override
    protected void write(PacketBuffer packet, MarketPlaceOffersMessage message) {
        // No fields to write
    }
}
