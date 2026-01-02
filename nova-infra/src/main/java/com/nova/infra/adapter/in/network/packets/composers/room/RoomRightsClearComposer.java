package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomRightsClearMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomRightsClear packet for client.
 */
@ComposesPacket(Outgoing.ROOM_RIGHTS_CLEAR)
public class RoomRightsClearComposer extends PacketComposer<RoomRightsClearMessage> {
@Override
    protected void write(PacketBuffer packet, RoomRightsClearMessage message) {
        // No fields to write
    }
}
