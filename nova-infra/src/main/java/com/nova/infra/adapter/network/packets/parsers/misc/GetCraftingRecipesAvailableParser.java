package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCraftingRecipesAvailableMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCraftingRecipesAvailable packet from client.
 */
@ParsesPacket(Incoming.GET_CRAFTING_RECIPES_AVAILABLE)
public class GetCraftingRecipesAvailableParser extends PacketParser<GetCraftingRecipesAvailableMessageEvent> {
@Override
    public GetCraftingRecipesAvailableMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCraftingRecipesAvailableMessageEvent();
    }
}
