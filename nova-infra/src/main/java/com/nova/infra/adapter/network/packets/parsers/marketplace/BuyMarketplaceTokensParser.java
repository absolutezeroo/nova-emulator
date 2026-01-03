package com.nova.infra.adapter.network.packets.parsers.marketplace;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.marketplace.BuyMarketplaceTokensMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
