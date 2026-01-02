package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogPageMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCatalogPage packet from client.
 */
@ParsesPacket(Incoming.GET_CATALOG_PAGE)
public class GetCatalogPageParser extends PacketParser<GetCatalogPageMessageEvent> {
@Override
    public GetCatalogPageMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogPageMessageEvent();
    }
}
