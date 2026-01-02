package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TargetedOfferMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes TargetedOffer packet for client.
 */
@ComposesPacket(Outgoing.TARGET_OFFER)
public class TargetedOfferComposer extends PacketComposer<TargetedOfferMessage> {
@Override
    protected void write(PacketBuffer packet, TargetedOfferMessage message) {
        // No fields to write
    }
}
