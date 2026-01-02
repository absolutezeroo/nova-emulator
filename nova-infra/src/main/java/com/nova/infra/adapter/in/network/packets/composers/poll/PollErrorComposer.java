package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.PollErrorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes PollError packet for client.
 */
@ComposesPacket(Outgoing.POLL_ERROR)
public class PollErrorComposer extends PacketComposer<PollErrorMessage> {
@Override
    protected void write(PacketBuffer packet, PollErrorMessage message) {
        // No fields to write
    }
}
