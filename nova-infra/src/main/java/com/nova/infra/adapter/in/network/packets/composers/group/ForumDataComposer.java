package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.ForumDataMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ForumData packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_DATA)
public class ForumDataComposer extends PacketComposer<ForumDataMessage> {
@Override
    protected void write(PacketBuffer packet, ForumDataMessage message) {
        // No fields to write
    }
}
