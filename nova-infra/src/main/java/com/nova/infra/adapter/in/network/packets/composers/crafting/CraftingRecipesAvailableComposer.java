package com.nova.infra.adapter.in.network.packets.composers.crafting;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.crafting.CraftingRecipesAvailableMessage;

/**
 * Composes CraftingRecipesAvailable packet for client.
 */
public class CraftingRecipesAvailableComposer extends PacketComposer<CraftingRecipesAvailableMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CRAFTING_RECIPES_AVAILABLE;
    }

    @Override
    protected void write(PacketBuffer packet, CraftingRecipesAvailableMessage message) {
        packet.appendInt(message.count());
        packet.appendBoolean(message.hasRecipes());
    }
}
