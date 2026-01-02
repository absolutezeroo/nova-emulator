package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.PollErrorMessage;

/**
 * Composes PollError packet for client.
 */
public class PollErrorComposer extends PacketComposer<PollErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.POLL_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, PollErrorMessage message) {
        // No fields to write
    }
}
