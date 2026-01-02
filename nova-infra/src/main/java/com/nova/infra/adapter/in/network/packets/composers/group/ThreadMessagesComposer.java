package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.ThreadMessagesMessage;

/**
 * Composes ThreadMessages packet for client.
 */
public class ThreadMessagesComposer extends PacketComposer<ThreadMessagesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_THREAD_MESSAGES;
    }

    @Override
    protected void write(PacketBuffer packet, ThreadMessagesMessage message) {
        packet.appendInt(message.groupId());
        packet.appendInt(message.threadId());
        packet.appendInt(message.startIndex());
        packet.appendInt(message.amount());
    }
}
