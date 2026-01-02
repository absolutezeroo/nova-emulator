package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.BuyMarketplaceTokensMessageEvent;

/**
 * Parses BuyMarketplaceTokens packet from client.
 */
public class BuyMarketplaceTokensParser extends PacketParser<BuyMarketplaceTokensMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_BUY_TOKENS;
    }

    @Override
    public BuyMarketplaceTokensMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new BuyMarketplaceTokensMessageEvent();
    }
}
