package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCraftingRecipesAvailableMessageEvent;

/**
 * Parses GetCraftingRecipesAvailable packet from client.
 */
public class GetCraftingRecipesAvailableParser extends PacketParser<GetCraftingRecipesAvailableMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CRAFTING_RECIPES_AVAILABLE;
    }

    @Override
    public GetCraftingRecipesAvailableMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCraftingRecipesAvailableMessageEvent();
    }
}
