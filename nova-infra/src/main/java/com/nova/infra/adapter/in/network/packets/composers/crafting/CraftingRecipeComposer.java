package com.nova.infra.adapter.in.network.packets.composers.crafting;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.crafting.CraftingRecipeMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CraftingRecipe packet for client.
 */
@ComposesPacket(Outgoing.CRAFTING_RECIPE)
public class CraftingRecipeComposer extends PacketComposer<CraftingRecipeMessage> {
@Override
    protected void write(PacketBuffer packet, CraftingRecipeMessage message) {
        packet.appendInt(message.count());
        packet.appendBoolean(message.hasRecipes());
    }
}
