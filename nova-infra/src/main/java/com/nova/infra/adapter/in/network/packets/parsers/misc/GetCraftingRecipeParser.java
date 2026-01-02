package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCraftingRecipeMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCraftingRecipe packet from client.
 */
@ParsesPacket(Incoming.GET_CRAFTABLE_PRODUCTS)
public class GetCraftingRecipeParser extends PacketParser<GetCraftingRecipeMessageEvent> {
@Override
    public GetCraftingRecipeMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCraftingRecipeMessageEvent();
    }
}
