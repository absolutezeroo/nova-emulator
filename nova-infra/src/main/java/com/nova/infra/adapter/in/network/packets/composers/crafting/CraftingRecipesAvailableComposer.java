package com.nova.infra.adapter.in.network.packets.composers.crafting;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.crafting.CraftingRecipesAvailableMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CraftingRecipesAvailable packet for client.
 */
@ComposesPacket(Outgoing.CRAFTING_RECIPES_AVAILABLE)
public class CraftingRecipesAvailableComposer extends PacketComposer<CraftingRecipesAvailableMessage> {
@Override
    protected void write(PacketBuffer packet, CraftingRecipesAvailableMessage message) {
        packet.appendInt(message.count());
        packet.appendBoolean(message.hasRecipes());
    }
}
