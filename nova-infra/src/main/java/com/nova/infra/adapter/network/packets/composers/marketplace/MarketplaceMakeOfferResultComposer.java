package com.nova.infra.adapter.network.packets.composers.marketplace;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.marketplace.MarketplaceMakeOfferResultMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MarketplaceMakeOfferResult packet for client.
 */
@ComposesPacket(Outgoing.MARKETPLACE_ITEM_POSTED)
public class MarketplaceMakeOfferResultComposer extends PacketComposer<MarketplaceMakeOfferResultMessage> {
@Override
    protected void write(PacketBuffer packet, MarketplaceMakeOfferResultMessage message) {
        // No fields to write
    }
}
