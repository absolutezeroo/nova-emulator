package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BundleDiscountRulesetMessage;

/**
 * Composes BundleDiscountRuleset packet for client.
 */
public class BundleDiscountRulesetComposer extends PacketComposer<BundleDiscountRulesetMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.BUNDLE_DISCOUNT_RULESET;
    }

    @Override
    protected void write(PacketBuffer packet, BundleDiscountRulesetMessage message) {
        // No fields to write
    }
}
