package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceCanMakeOfferResultMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes MarketplaceCanMakeOfferResult packet for client.
 */
@ComposesPacket(Outgoing.MARKETPLACE_SELL_ITEM)
public class MarketplaceCanMakeOfferResultComposer extends PacketComposer<MarketplaceCanMakeOfferResultMessage> {
@Override
    protected void write(PacketBuffer packet, MarketplaceCanMakeOfferResultMessage message) {
        packet.appendInt(message.result());
        packet.appendInt(message.tokenCount());
    }
}
