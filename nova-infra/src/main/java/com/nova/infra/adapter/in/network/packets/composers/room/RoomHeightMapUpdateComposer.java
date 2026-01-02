package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomHeightMapUpdateMessage;

/**
 * Composes RoomHeightMapUpdate packet for client.
 */
public class RoomHeightMapUpdateComposer extends PacketComposer<RoomHeightMapUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_HEIGHT_MAP_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomHeightMapUpdateMessage message) {
        // No fields to write
    }
}
