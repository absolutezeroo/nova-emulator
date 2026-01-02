package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.IssueDeletedMessage;

/**
 * Composes IssueDeleted packet for client.
 */
public class IssueDeletedComposer extends PacketComposer<IssueDeletedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ISSUE_DELETED;
    }

    @Override
    protected void write(PacketBuffer packet, IssueDeletedMessage message) {
        // No fields to write
    }
}
