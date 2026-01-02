package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetBundleDiscountRulesetMessageEvent;

/**
 * Parses GetBundleDiscountRuleset packet from client.
 */
public class GetBundleDiscountRulesetParser extends PacketParser<GetBundleDiscountRulesetMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_BUNDLE_DISCOUNT_RULESET;
    }

    @Override
    public GetBundleDiscountRulesetMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetBundleDiscountRulesetMessageEvent();
    }
}
