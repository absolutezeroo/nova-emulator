package com.nova.infra.adapter.network.packets.outgoing.crafting;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record CraftingRecipesAvailableMessage(
    int count,
    boolean hasRecipes
) implements IOutgoingPacket {}
