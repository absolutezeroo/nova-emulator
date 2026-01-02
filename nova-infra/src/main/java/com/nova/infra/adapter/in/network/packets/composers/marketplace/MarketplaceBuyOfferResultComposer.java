package com.nova.infra.adapter.in.network.packets.composers.marketplace;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.marketplace.MarketplaceBuyOfferResultMessage;

/**
 * Composes MarketplaceBuyOfferResult packet for client.
 */
public class MarketplaceBuyOfferResultComposer extends PacketComposer<MarketplaceBuyOfferResultMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MARKETPLACE_AFTER_ORDER_STATUS;
    }

    @Override
    protected void write(PacketBuffer packet, MarketplaceBuyOfferResultMessage message) {
        packet.appendInt(message.result());
        packet.appendInt(message.newOfferId());
        packet.appendInt(message.newPrice());
        packet.appendInt(message.requestedOfferId());
    }
}
