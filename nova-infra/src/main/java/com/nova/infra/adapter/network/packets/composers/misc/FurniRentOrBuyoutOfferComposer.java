package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FurniRentOrBuyoutOfferMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurniRentOrBuyoutOffer packet for client.
 */
@ComposesPacket(Outgoing.RENTABLE_FURNI_RENT_OR_BUYOUT_OFFER)
public class FurniRentOrBuyoutOfferComposer extends PacketComposer<FurniRentOrBuyoutOfferMessage> {
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
