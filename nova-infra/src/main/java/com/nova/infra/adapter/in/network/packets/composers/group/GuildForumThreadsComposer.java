package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.GuildForumThreadsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes GuildForumThreads packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_THREADS)
public class GuildForumThreadsComposer extends PacketComposer<GuildForumThreadsMessage> {
@Override
    protected void write(PacketBuffer packet, GuildForumThreadsMessage message) {
        packet.appendInt(message.groupId());
        packet.appendInt(message.startIndex());
        packet.appendInt(message.amount());
    }
}
