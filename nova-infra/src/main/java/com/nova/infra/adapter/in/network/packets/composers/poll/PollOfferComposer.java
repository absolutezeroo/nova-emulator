package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.PollOfferMessage;

/**
 * Composes PollOffer packet for client.
 */
public class PollOfferComposer extends PacketComposer<PollOfferMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.POLL_OFFER;
    }

    @Override
    protected void write(PacketBuffer packet, PollOfferMessage message) {
        // No fields to write
    }
}
