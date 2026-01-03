package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.LimitedOfferAppearingNextMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes LimitedOfferAppearingNext packet for client.
 */
@ComposesPacket(Outgoing.LIMITED_OFFER_APPEARING_NEXT)
public class LimitedOfferAppearingNextComposer extends PacketComposer<LimitedOfferAppearingNextMessage> {
@Override
    protected void write(PacketBuffer packet, LimitedOfferAppearingNextMessage message) {
        packet.appendInt(message.appearsInSeconds());
        packet.appendInt(message.pageId());
        packet.appendInt(message.offerId());
        packet.appendString(message.productType());
    }
}
