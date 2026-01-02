package com.nova.infra.adapter.in.network.packets.parsers.marketplace;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.marketplace.RedeemMarketplaceOfferCreditsMessageEvent;

/**
 * Parses RedeemMarketplaceOfferCredits packet from client.
 */
public class RedeemMarketplaceOfferCreditsParser extends PacketParser<RedeemMarketplaceOfferCreditsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MARKETPLACE_REDEEM_CREDITS;
    }

    @Override
    public RedeemMarketplaceOfferCreditsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RedeemMarketplaceOfferCreditsMessageEvent();
    }
}
