package com.nova.infra.adapter.network.packets.parsers.marketplace;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.marketplace.RedeemMarketplaceOfferCreditsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RedeemMarketplaceOfferCredits packet from client.
 */
@ParsesPacket(Incoming.MARKETPLACE_REDEEM_CREDITS)
public class RedeemMarketplaceOfferCreditsParser extends PacketParser<RedeemMarketplaceOfferCreditsMessageEvent> {
@Override
    public RedeemMarketplaceOfferCreditsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RedeemMarketplaceOfferCreditsMessageEvent();
    }
}
