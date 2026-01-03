package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetMarketplaceItemStatsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetMarketplaceItemStats packet from client.
 */
@ParsesPacket(Incoming.REQUEST_MARKETPLACE_ITEM_STATS)
public class GetMarketplaceItemStatsParser extends PacketParser<GetMarketplaceItemStatsMessageEvent> {
@Override
    public GetMarketplaceItemStatsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceItemStatsMessageEvent();
    }
}
