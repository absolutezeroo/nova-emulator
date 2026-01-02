package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurniRentOrBuyoutOfferMessage;

/**
 * Composes FurniRentOrBuyoutOffer packet for client.
 */
public class FurniRentOrBuyoutOfferComposer extends PacketComposer<FurniRentOrBuyoutOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.RENTABLE_FURNI_RENT_OR_BUYOUT_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, FurniRentOrBuyoutOfferMessage message) {
        packet.appendBoolean(message.isWallItem());
        packet.appendString(message.furniTypeName());
        packet.appendBoolean(message.buyout());
        packet.appendInt(message.priceInCredits());
        packet.appendInt(message.priceInActivityPoints());
        packet.appendInt(message.activityPointType());
    }
}
