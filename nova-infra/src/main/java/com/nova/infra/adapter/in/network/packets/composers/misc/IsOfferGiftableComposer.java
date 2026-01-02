package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IsOfferGiftableMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes IsOfferGiftable packet for client.
 */
@ComposesPacket(Outgoing.IS_OFFER_GIFTABLE)
public class IsOfferGiftableComposer extends PacketComposer<IsOfferGiftableMessage> {
@Override
    protected void write(PacketBuffer packet, IsOfferGiftableMessage message) {
        packet.appendInt(message.offerId());
        packet.appendBoolean(message.isGiftable());
    }
}
