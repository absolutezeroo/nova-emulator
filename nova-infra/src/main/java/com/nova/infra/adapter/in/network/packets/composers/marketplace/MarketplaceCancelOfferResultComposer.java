package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceCancelOfferResultMessage;

/**
 * Composes MarketplaceCancelOfferResult packet for client.
 */
public class MarketplaceCancelOfferResultComposer extends PacketComposer<MarketplaceCancelOfferResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_CANCEL_SALE;
    }

    @Override
    protected void write(PacketBuffer packet, MarketplaceCancelOfferResultMessage message) {
        packet.appendInt(message.offerId());
        packet.appendBoolean(message.success());
    }
}
