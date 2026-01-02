package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCraftingRecipeMessageEvent;

/**
 * Parses GetCraftingRecipe packet from client.
 */
public class GetCraftingRecipeParser extends PacketParser<GetCraftingRecipeMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CRAFTABLE_PRODUCTS;
    }

    @Override
    public GetCraftingRecipeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCraftingRecipeMessageEvent();
    }
}
