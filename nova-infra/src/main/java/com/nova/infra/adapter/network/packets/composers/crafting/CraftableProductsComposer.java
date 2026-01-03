package com.nova.infra.adapter.network.packets.composers.crafting;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.crafting.CraftableProductsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CraftableProducts packet for client.
 */
@ComposesPacket(Outgoing.CRAFTABLE_PRODUCTS)
public class CraftableProductsComposer extends PacketComposer<CraftableProductsMessage> {
@Override
    protected void write(PacketBuffer packet, CraftableProductsMessage message) {
        // No fields to write
    }
}
