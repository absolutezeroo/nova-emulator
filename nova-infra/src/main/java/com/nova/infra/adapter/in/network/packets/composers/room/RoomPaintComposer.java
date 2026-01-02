package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomPaintMessage;

/**
 * Composes RoomPaint packet for client.
 */
public class RoomPaintComposer extends PacketComposer<RoomPaintMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_PAINT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomPaintMessage message) {
        // No fields to write
    }
}
