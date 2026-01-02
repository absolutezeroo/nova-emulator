package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.LimitedOfferAppearingNextMessage;

/**
 * Composes LimitedOfferAppearingNext packet for client.
 */
public class LimitedOfferAppearingNextComposer extends PacketComposer<LimitedOfferAppearingNextMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.LIMITED_OFFER_APPEARING_NEXT;
    }

    @Override
    protected void write(PacketBuffer packet, LimitedOfferAppearingNextMessage message) {
        packet.appendInt(message.appearsInSeconds());
        packet.appendInt(message.pageId());
        packet.appendInt(message.offerId());
        packet.appendString(message.productType());
    }
}
