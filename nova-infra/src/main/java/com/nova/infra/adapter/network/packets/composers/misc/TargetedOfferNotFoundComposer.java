package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.TargetedOfferNotFoundMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes TargetedOfferNotFound packet for client.
 */
@ComposesPacket(Outgoing.TARGET_OFFER_NOT_FOUND)
public class TargetedOfferNotFoundComposer extends PacketComposer<TargetedOfferNotFoundMessage> {
@Override
    protected void write(PacketBuffer packet, TargetedOfferNotFoundMessage message) {
        // No fields to write
    }
}
