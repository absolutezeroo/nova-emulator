package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketPlaceOffersMessage;

/**
 * Composes MarketPlaceOffers packet for client.
 */
public class MarketPlaceOffersComposer extends PacketComposer<MarketPlaceOffersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_ITEMS_SEARCHED;
    }

    @Override
    protected void write(PacketBuffer packet, MarketPlaceOffersMessage message) {
        // No fields to write
    }
}
