package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceCanMakeOfferResultMessage;

/**
 * Composes MarketplaceCanMakeOfferResult packet for client.
 */
public class MarketplaceCanMakeOfferResultComposer extends PacketComposer<MarketplaceCanMakeOfferResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_SELL_ITEM;
    }

    @Override
    protected void write(PacketBuffer packet, MarketplaceCanMakeOfferResultMessage message) {
        packet.appendInt(message.result());
        packet.appendInt(message.tokenCount());
    }
}
