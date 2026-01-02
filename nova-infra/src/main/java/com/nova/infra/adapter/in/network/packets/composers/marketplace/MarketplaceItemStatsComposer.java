package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceItemStatsMessage;

/**
 * Composes MarketplaceItemStats packet for client.
 */
public class MarketplaceItemStatsComposer extends PacketComposer<MarketplaceItemStatsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_ITEM_STATS;
    }

    @Override
    protected void write(PacketBuffer packet, MarketplaceItemStatsMessage message) {
        packet.appendInt(message.averagePrice());
        packet.appendInt(message.currentOfferCount());
        packet.appendInt(message.historyLength());
    }
}
