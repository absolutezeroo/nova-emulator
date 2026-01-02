package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetMarketplaceItemStatsMessageEvent;

/**
 * Parses GetMarketplaceItemStats packet from client.
 */
public class GetMarketplaceItemStatsParser extends PacketParser<GetMarketplaceItemStatsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.REQUEST_MARKETPLACE_ITEM_STATS;
    }

    @Override
    public GetMarketplaceItemStatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceItemStatsMessageEvent();
    }
}
