package com.nova.infra.adapter.network.packets.composers.marketplace;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.marketplace.MarketplaceItemStatsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MarketplaceItemStats packet for client.
 */
@ComposesPacket(Outgoing.MARKETPLACE_ITEM_STATS)
public class MarketplaceItemStatsComposer extends PacketComposer<MarketplaceItemStatsMessage> {
@Override
    protected void write(PacketBuffer packet, MarketplaceItemStatsMessage message) {
        packet.appendInt(message.averagePrice());
        packet.appendInt(message.currentOfferCount());
        packet.appendInt(message.historyLength());
    }
}
