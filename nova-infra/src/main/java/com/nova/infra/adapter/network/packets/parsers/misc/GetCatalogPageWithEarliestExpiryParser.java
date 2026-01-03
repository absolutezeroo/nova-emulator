package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetCatalogPageWithEarliestExpiryMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCatalogPageWithEarliestExpiry packet from client.
 */
@ParsesPacket(Incoming.GET_CATALOG_PAGE_WITH_EARLIEST_EXP)
public class GetCatalogPageWithEarliestExpiryParser extends PacketParser<GetCatalogPageWithEarliestExpiryMessageEvent> {
@Override
    public GetCatalogPageWithEarliestExpiryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogPageWithEarliestExpiryMessageEvent();
    }
}
