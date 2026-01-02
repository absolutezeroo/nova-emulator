package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.TargetedOfferNotFoundMessage;

/**
 * Composes TargetedOfferNotFound packet for client.
 */
public class TargetedOfferNotFoundComposer extends PacketComposer<TargetedOfferNotFoundMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.TARGET_OFFER_NOT_FOUND;
    }

    @Override
    protected void write(PacketBuffer packet, TargetedOfferNotFoundMessage message) {
        // No fields to write
    }
}
