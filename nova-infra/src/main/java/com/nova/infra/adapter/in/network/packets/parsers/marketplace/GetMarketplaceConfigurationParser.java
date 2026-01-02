package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.GetMarketplaceConfigurationMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetMarketplaceConfiguration packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_CONFIG)
public class GetMarketplaceConfigurationParser extends PacketParser<GetMarketplaceConfigurationMessageEvent> {
@Override
    public GetMarketplaceConfigurationMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMarketplaceConfigurationMessageEvent();
    }
}
