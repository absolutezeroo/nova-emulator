package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCraftableProductsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCraftableProducts packet from client.
 */
@ParsesPacket(Incoming.GET_CRAFTING_RECIPE)
public class GetCraftableProductsParser extends PacketParser<GetCraftableProductsMessageEvent> {
@Override
    public GetCraftableProductsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCraftableProductsMessageEvent();
    }
}
