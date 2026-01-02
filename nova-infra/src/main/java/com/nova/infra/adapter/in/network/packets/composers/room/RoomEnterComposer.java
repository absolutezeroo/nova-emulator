package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEnterMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomEnter packet for client.
 */
@ComposesPacket(Outgoing.ROOM_ENTER)
public class RoomEnterComposer extends PacketComposer<RoomEnterMessage> {
@Override
    protected void write(PacketBuffer packet, RoomEnterMessage message) {
        // No fields to write
    }
}
