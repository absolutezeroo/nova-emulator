package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogIndexMessageEvent;

/**
 * Parses GetCatalogIndex packet from client.
 */
public class GetCatalogIndexParser extends PacketParser<GetCatalogIndexMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CATALOG_INDEX;
    }

    @Override
    public GetCatalogIndexMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogIndexMessageEvent();
    }
}
