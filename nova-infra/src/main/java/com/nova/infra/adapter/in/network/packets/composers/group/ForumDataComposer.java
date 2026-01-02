package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.ForumDataMessage;

/**
 * Composes ForumData packet for client.
 */
public class ForumDataComposer extends PacketComposer<ForumDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GROUP_FORUM_DATA;
    }

    @Override
    protected void write(PacketBuffer packet, ForumDataMessage message) {
        // No fields to write
    }
}
