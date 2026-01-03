package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomHeightMapUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomHeightMapUpdate packet for client.
 */
@ComposesPacket(Outgoing.ROOM_HEIGHT_MAP_UPDATE)
public class RoomHeightMapUpdateComposer extends PacketComposer<RoomHeightMapUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, RoomHeightMapUpdateMessage message) {
        // No fields to write
    }
}
