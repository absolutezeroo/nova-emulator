package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IsOfferGiftableMessage;

/**
 * Composes IsOfferGiftable packet for client.
 */
public class IsOfferGiftableComposer extends PacketComposer<IsOfferGiftableMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.IS_OFFER_GIFTABLE;
    }

    @Override
    protected void write(PacketBuffer packet, IsOfferGiftableMessage message) {
        packet.appendInt(message.offerId());
        packet.appendBoolean(message.isGiftable());
    }
}
