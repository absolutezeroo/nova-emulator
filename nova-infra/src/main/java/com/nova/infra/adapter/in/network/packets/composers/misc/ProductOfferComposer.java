package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ProductOfferMessage;

/**
 * Composes ProductOffer packet for client.
 */
public class ProductOfferComposer extends PacketComposer<ProductOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.PRODUCT_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, ProductOfferMessage message) {
        // No fields to write
    }
}
