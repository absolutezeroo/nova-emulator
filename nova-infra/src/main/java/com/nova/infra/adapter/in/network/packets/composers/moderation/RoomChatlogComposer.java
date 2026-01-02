package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.RoomChatlogMessage;

/**
 * Composes RoomChatlog packet for client.
 */
public class RoomChatlogComposer extends PacketComposer<RoomChatlogMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODTOOL_ROOM_CHATLOG;
    }

    @Override
    protected void write(PacketBuffer packet, RoomChatlogMessage message) {
        // No fields to write
    }
}
