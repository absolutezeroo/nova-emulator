package com.nova.infra.adapter.in.network.packets.composers.group;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.group.UpdateMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes Update packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_UPDATE_MESSAGE)
public class UpdateComposer extends PacketComposer<UpdateMessage> {
@Override
    protected void write(PacketBuffer packet, UpdateMessage message) {
        packet.appendInt(message.groupId());
        packet.appendInt(message.threadId());
    }
}
