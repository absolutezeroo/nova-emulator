package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogPageMessageEvent;

/**
 * Parses GetCatalogPage packet from client.
 */
public class GetCatalogPageParser extends PacketParser<GetCatalogPageMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CATALOG_PAGE;
    }

    @Override
    public GetCatalogPageMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogPageMessageEvent();
    }
}
