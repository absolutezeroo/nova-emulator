package com.nova.infra.adapter.in.network.packets.composers.poll;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.poll.PollContentsMessage;

/**
 * Composes PollContents packet for client.
 */
public class PollContentsComposer extends PacketComposer<PollContentsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.POLL_CONTENTS;
    }

    @Override
    protected void write(PacketBuffer packet, PollContentsMessage message) {
        // No fields to write
    }
}
