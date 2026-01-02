package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.BuyMarketplaceTokensMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses BuyMarketplaceTokens packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_BUY_TOKENS)
public class BuyMarketplaceTokensParser extends PacketParser<BuyMarketplaceTokensMessageEvent> {
@Override
    public BuyMarketplaceTokensMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuyMarketplaceTokensMessageEvent();
    }
}
