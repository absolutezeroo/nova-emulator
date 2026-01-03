package com.nova.infra.adapter.network.packets.composers.group;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.group.UpdateThreadMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UpdateThread packet for client.
 */
@ComposesPacket(Outgoing.GROUP_FORUM_UPDATE_THREAD)
public class UpdateThreadComposer extends PacketComposer<UpdateThreadMessage> {
@Override
    protected void write(PacketBuffer packet, UpdateThreadMessage message) {
        packet.appendInt(message.groupId());
    }
}
