package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomRightsClearMessage;

/**
 * Composes RoomRightsClear packet for client.
 */
public class RoomRightsClearComposer extends PacketComposer<RoomRightsClearMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_RIGHTS_CLEAR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomRightsClearMessage message) {
        // No fields to write
    }
}
