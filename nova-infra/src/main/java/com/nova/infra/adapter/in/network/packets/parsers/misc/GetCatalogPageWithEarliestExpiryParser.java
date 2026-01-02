package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetCatalogPageWithEarliestExpiryMessageEvent;

/**
 * Parses GetCatalogPageWithEarliestExpiry packet from client.
 */
public class GetCatalogPageWithEarliestExpiryParser extends PacketParser<GetCatalogPageWithEarliestExpiryMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_CATALOG_PAGE_WITH_EARLIEST_EXP;
    }

    @Override
    public GetCatalogPageWithEarliestExpiryMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCatalogPageWithEarliestExpiryMessageEvent();
    }
}
