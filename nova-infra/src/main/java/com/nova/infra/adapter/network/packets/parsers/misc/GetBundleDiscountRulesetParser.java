package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetBundleDiscountRulesetMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetBundleDiscountRuleset packet from client.
 */
@ParsesPacket(Incoming.GET_BUNDLE_DISCOUNT_RULESET)
public class GetBundleDiscountRulesetParser extends PacketParser<GetBundleDiscountRulesetMessageEvent> {
@Override
    public GetBundleDiscountRulesetMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBundleDiscountRulesetMessageEvent();
    }
}
