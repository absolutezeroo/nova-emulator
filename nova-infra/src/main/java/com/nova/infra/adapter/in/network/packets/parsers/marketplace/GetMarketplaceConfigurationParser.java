package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.GetMarketplaceConfigurationMessageEvent;

/**
 * Parses GetMarketplaceConfiguration packet from client.
 */
public class GetMarketplaceConfigurationParser extends PacketParser<GetMarketplaceConfigurationMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_CONFIG;
    }

    @Override
    public GetMarketplaceConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceConfigurationMessageEvent();
    }
}
