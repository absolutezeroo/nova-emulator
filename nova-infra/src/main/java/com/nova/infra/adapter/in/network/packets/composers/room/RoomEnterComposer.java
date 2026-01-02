package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEnterMessage;

/**
 * Composes RoomEnter packet for client.
 */
public class RoomEnterComposer extends PacketComposer<RoomEnterMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_ENTER;
    }

    @Override
    protected void write(PacketBuffer packet, RoomEnterMessage message) {
        // No fields to write
    }
}
