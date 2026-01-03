package com.nova.infra.adapter.network.packets.composers.poll;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.poll.PollContentsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PollContents packet for client.
 */
@ComposesPacket(Outgoing.POLL_CONTENTS)
public class PollContentsComposer extends PacketComposer<PollContentsMessage> {
@Override
    protected void write(PacketBuffer packet, PollContentsMessage message) {
        // No fields to write
    }
}
