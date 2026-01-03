package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.IssueInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes IssueInfo packet for client.
 */
@ComposesPacket(Outgoing.ISSUE_INFO)
public class IssueInfoComposer extends PacketComposer<IssueInfoMessage> {
@Override
    protected void write(PacketBuffer packet, IssueInfoMessage message) {
        // No fields to write
    }
}
