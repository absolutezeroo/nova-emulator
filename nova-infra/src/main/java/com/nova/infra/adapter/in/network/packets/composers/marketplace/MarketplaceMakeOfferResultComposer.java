package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceMakeOfferResultMessage;

/**
 * Composes MarketplaceMakeOfferResult packet for client.
 */
public class MarketplaceMakeOfferResultComposer extends PacketComposer<MarketplaceMakeOfferResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_ITEM_POSTED;
    }

    @Override
    protected void write(PacketBuffer packet, MarketplaceMakeOfferResultMessage message) {
        // No fields to write
    }
}
