package com.nova.infra.adapter.in.network.packets.parsers.catalog;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.catalog.GetSellablePetPalettesMessageEvent;

/**
 * Parses GetSellablePetPalettes packet from client.
 */
public class GetSellablePetPalettesParser extends PacketParser<GetSellablePetPalettesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.CATALOG_REQUESET_PET_BREEDS;
    }

    @Override
    public GetSellablePetPalettesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetSellablePetPalettesMessageEvent();
    }
}
