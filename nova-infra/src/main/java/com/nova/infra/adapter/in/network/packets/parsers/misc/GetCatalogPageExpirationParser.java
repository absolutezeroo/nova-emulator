package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogPageExpirationMessageEvent;

/**
 * Parses GetCatalogPageExpiration packet from client.
 */
public class GetCatalogPageExpirationParser extends PacketParser<GetCatalogPageExpirationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CATALOG_PAGE_EXPIRATION;
    }

    @Override
    public GetCatalogPageExpirationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogPageExpirationMessageEvent();
    }
}
