package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEnterErrorMessage;

/**
 * Composes RoomEnterError packet for client.
 */
public class RoomEnterErrorComposer extends PacketComposer<RoomEnterErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_ENTER_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomEnterErrorMessage message) {
        // No fields to write
    }
}
