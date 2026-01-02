package com.nova.infra.adapter.in.network.packets.composers.crafting;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.crafting.CraftingRecipeMessage;

/**
 * Composes CraftingRecipe packet for client.
 */
public class CraftingRecipeComposer extends PacketComposer<CraftingRecipeMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CRAFTING_RECIPE;
    }

    @Override
    protected void write(PacketBuffer packet, CraftingRecipeMessage message) {
        packet.appendInt(message.count());
        packet.appendBoolean(message.hasRecipes());
    }
}
