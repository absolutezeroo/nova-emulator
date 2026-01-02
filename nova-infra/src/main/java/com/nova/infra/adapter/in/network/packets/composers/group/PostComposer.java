package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.PostMessage;

/**
 * Composes Post packet for client.
 */
public class PostComposer extends PacketComposer<PostMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_POST;
    }

    @Override
    protected void write(PacketBuffer packet, PostMessage message) {
        packet.appendInt(message.groupId());
        packet.appendInt(message.threadId());
    }
}
