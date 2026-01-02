package com.nova.infra.adapter.in.network.packets.composers.crafting;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.crafting.CraftableProductsMessage;

/**
 * Composes CraftableProducts packet for client.
 */
public class CraftableProductsComposer extends PacketComposer<CraftableProductsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CRAFTABLE_PRODUCTS;
    }

    @Override
    protected void write(PacketBuffer packet, CraftableProductsMessage message) {
        // No fields to write
    }
}
