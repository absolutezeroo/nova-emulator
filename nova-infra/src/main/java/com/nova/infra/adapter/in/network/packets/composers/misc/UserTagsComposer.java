package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.UserTagsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes UserTags packet for client.
 */
@ComposesPacket(Outgoing.GET_USER_TAGS)
public class UserTagsComposer extends PacketComposer<UserTagsMessage> {
@Override
    protected void write(PacketBuffer packet, UserTagsMessage message) {
        packet.appendInt(message.roomUnitId());
    }
}
