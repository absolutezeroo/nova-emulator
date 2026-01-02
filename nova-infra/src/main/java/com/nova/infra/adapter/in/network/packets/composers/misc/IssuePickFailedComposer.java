package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IssuePickFailedMessage;

/**
 * Composes IssuePickFailed packet for client.
 */
public class IssuePickFailedComposer extends PacketComposer<IssuePickFailedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ISSUE_PICK_FAILED;
    }

    @Override
    protected void write(PacketBuffer packet, IssuePickFailedMessage message) {
        // No fields to write
    }
}
