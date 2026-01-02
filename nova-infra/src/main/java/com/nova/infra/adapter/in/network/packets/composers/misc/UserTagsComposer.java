package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.UserTagsMessage;

/**
 * Composes UserTags packet for client.
 */
public class UserTagsComposer extends PacketComposer<UserTagsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.GET_USER_TAGS;
    }

    @Override
    protected void write(PacketBuffer packet, UserTagsMessage message) {
        packet.appendInt(message.roomUnitId());
    }
}
