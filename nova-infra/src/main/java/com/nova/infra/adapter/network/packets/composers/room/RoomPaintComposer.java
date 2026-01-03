package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomPaintMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomPaint packet for client.
 */
@ComposesPacket(Outgoing.ROOM_PAINT)
public class RoomPaintComposer extends PacketComposer<RoomPaintMessage> {
@Override
    protected void write(PacketBuffer packet, RoomPaintMessage message) {
        // No fields to write
    }
}
