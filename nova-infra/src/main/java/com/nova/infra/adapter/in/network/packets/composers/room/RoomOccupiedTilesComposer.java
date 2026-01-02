package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomOccupiedTilesMessage;

/**
 * Composes RoomOccupiedTiles packet for client.
 */
public class RoomOccupiedTilesComposer extends PacketComposer<RoomOccupiedTilesMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_MODEL_BLOCKED_TILES;
    }

    @Override
    protected void write(PacketBuffer packet, RoomOccupiedTilesMessage message) {
        // No fields to write
    }
}
