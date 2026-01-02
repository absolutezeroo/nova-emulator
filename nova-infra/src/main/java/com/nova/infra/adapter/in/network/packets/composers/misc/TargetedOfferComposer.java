package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TargetedOfferMessage;

/**
 * Composes TargetedOffer packet for client.
 */
public class TargetedOfferComposer extends PacketComposer<TargetedOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TARGET_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, TargetedOfferMessage message) {
        // No fields to write
    }
}
