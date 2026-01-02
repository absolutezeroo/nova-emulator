package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ProductOfferMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ProductOffer packet for client.
 */
@ComposesPacket(Outgoing.PRODUCT_OFFER)
public class ProductOfferComposer extends PacketComposer<ProductOfferMessage> {
@Override
    protected void write(PacketBuffer packet, ProductOfferMessage message) {
        // No fields to write
    }
}
