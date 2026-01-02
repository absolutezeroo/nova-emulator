package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IssueInfoMessage;

/**
 * Composes IssueInfo packet for client.
 */
public class IssueInfoComposer extends PacketComposer<IssueInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ISSUE_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, IssueInfoMessage message) {
        // No fields to write
    }
}
