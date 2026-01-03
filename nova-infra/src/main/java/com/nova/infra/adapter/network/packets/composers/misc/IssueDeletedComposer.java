package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.IssueDeletedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes IssueDeleted packet for client.
 */
@ComposesPacket(Outgoing.ISSUE_DELETED)
public class IssueDeletedComposer extends PacketComposer<IssueDeletedMessage> {
@Override
    protected void write(PacketBuffer packet, IssueDeletedMessage message) {
        // No fields to write
    }
}
