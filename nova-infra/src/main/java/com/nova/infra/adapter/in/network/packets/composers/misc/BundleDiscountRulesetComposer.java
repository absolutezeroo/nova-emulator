package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.BundleDiscountRulesetMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes BundleDiscountRuleset packet for client.
 */
@ComposesPacket(Outgoing.BUNDLE_DISCOUNT_RULESET)
public class BundleDiscountRulesetComposer extends PacketComposer<BundleDiscountRulesetMessage> {
@Override
    protected void write(PacketBuffer packet, BundleDiscountRulesetMessage message) {
        // No fields to write
    }
}
