package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.RoomChatlogMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomChatlog packet for client.
 */
@ComposesPacket(Outgoing.MODTOOL_ROOM_CHATLOG)
public class RoomChatlogComposer extends PacketComposer<RoomChatlogMessage> {
@Override
    protected void write(PacketBuffer packet, RoomChatlogMessage message) {
        // No fields to write
    }
}
