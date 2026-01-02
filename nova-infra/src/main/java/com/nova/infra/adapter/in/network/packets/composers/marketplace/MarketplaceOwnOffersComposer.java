package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceOwnOffersMessage;

/**
 * Composes MarketplaceOwnOffers packet for client.
 */
public class MarketplaceOwnOffersComposer extends PacketComposer<MarketplaceOwnOffersMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_OWN_ITEMS;
    }

    @Override
    protected void write(PacketBuffer packet, MarketplaceOwnOffersMessage message) {
        packet.appendInt(message.creditsWaiting());
    }
}
