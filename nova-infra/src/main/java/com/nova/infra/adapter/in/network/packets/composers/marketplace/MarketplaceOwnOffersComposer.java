package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceOwnOffersMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes MarketplaceOwnOffers packet for client.
 */
@ComposesPacket(Outgoing.MARKETPLACE_OWN_ITEMS)
public class MarketplaceOwnOffersComposer extends PacketComposer<MarketplaceOwnOffersMessage> {
@Override
    protected void write(PacketBuffer packet, MarketplaceOwnOffersMessage message) {
        packet.appendInt(message.creditsWaiting());
    }
}
