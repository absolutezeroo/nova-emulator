package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.PostThreadMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes PostThread packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_POST_THREAD)
public class PostThreadComposer extends PacketComposer<PostThreadMessage> {
@Override
    protected void write(PacketBuffer packet, PostThreadMessage message) {
        packet.appendInt(message.groupId());
    }
}
