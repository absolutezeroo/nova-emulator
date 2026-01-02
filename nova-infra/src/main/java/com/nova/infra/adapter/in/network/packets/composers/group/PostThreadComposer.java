package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.PostThreadMessage;

/**
 * Composes PostThread packet for client.
 */
public class PostThreadComposer extends PacketComposer<PostThreadMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_POST_THREAD;
    }

    @Override
    protected void write(PacketBuffer packet, PostThreadMessage message) {
        packet.appendInt(message.groupId());
    }
}
