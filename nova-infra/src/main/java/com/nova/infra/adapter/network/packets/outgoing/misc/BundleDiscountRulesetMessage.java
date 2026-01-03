package com.nova.infra.adapter.network.packets.outgoing.misc;

import com.nova.infra.adapter.network.packets.IOutgoingPacket;

/**
 * Message sent to client.
 */
public record BundleDiscountRulesetMessage(
    // No fields parsed
) implements IOutgoingPacket {}
