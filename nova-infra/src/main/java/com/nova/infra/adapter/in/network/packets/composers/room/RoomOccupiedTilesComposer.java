package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomOccupiedTilesMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomOccupiedTiles packet for client.
 */
@ComposesPacket(Outgoing.ROOM_MODEL_BLOCKED_TILES)
public class RoomOccupiedTilesComposer extends PacketComposer<RoomOccupiedTilesMessage> {
@Override
    protected void write(PacketBuffer packet, RoomOccupiedTilesMessage message) {
        // No fields to write
    }
}
