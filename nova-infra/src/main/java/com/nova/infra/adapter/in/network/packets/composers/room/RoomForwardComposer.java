package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomForwardMessage;

/**
 * Composes RoomForward packet for client.
 */
public class RoomForwardComposer extends PacketComposer<RoomForwardMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_FORWARD;
    }

    @Override
    protected void write(PacketBuffer packet, RoomForwardMessage message) {
        // No fields to write
    }
}
