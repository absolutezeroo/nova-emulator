package com.nova.infra.adapter.network.packets.parsers.catalog;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.catalog.GetSellablePetPalettesMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetSellablePetPalettes packet from client.
 */
@ParsesPacket(Incoming.CATALOG_REQUESET_PET_BREEDS)
public class GetSellablePetPalettesParser extends PacketParser<GetSellablePetPalettesMessageEvent> {
@Override
    public GetSellablePetPalettesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSellablePetPalettesMessageEvent();
    }
}
