package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IssuePickFailedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes IssuePickFailed packet for client.
 */
@ComposesPacket(Outgoing.ISSUE_PICK_FAILED)
public class IssuePickFailedComposer extends PacketComposer<IssuePickFailedMessage> {
@Override
    protected void write(PacketBuffer packet, IssuePickFailedMessage message) {
        // No fields to write
    }
}
