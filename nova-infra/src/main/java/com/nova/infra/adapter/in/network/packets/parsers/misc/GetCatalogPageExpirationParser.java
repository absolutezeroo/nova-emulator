package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogPageExpirationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCatalogPageExpiration packet from client.
 */
@ParsesPacket(Incoming.GET_CATALOG_PAGE_EXPIRATION)
public class GetCatalogPageExpirationParser extends PacketParser<GetCatalogPageExpirationMessageEvent> {
@Override
    public GetCatalogPageExpirationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogPageExpirationMessageEvent();
    }
}
