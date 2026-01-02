package com.nova.infra.adapter.in.network.packets.composers.moderation;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.moderation.ModeratorRoomInfoMessage;

/**
 * Composes ModeratorRoomInfo packet for client.
 */
public class ModeratorRoomInfoComposer extends PacketComposer<ModeratorRoomInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.MODTOOL_ROOM_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, ModeratorRoomInfoMessage message) {
        // No fields to write
    }
}
