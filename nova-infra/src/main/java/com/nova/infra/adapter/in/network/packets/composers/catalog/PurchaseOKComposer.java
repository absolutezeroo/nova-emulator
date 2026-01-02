package com.nova.infra.adapter.in.network.packets.composers.catalog;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.catalog.PurchaseOKMessage;

/**
 * Composes PurchaseOK packet for client.
 */
public class PurchaseOKComposer extends PacketComposer<PurchaseOKMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CATALOG_PURCHASE_OK;
    }

    @Override
    protected void write(PacketBuffer packet, PurchaseOKMessage message) {
        packet.appendInt(message.offerId());
        packet.appendString(message.localizationId());
        packet.appendBoolean(message.rent());
        packet.appendInt(message.priceCredits());
        packet.appendInt(message.priceActivityPoints());
        packet.appendInt(message.priceActivityPointsType());
        packet.appendBoolean(message.giftable());
    }
}
