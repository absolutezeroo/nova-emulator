package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.PollOfferMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PollOffer packet for client.
 */
@ComposesPacket(Outgoing.POLL_OFFER)
public class PollOfferComposer extends PacketComposer<PollOfferMessage> {
@Override
    protected void write(PacketBuffer packet, PollOfferMessage message) {
        // No fields to write
    }
}
