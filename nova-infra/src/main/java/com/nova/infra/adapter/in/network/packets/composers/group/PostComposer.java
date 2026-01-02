package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.PostMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Post packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_POST)
public class PostComposer extends PacketComposer<PostMessage> {
@Override
    protected void write(PacketBuffer packet, PostMessage message) {
        packet.appendInt(message.groupId());
        packet.appendInt(message.threadId());
    }
}
