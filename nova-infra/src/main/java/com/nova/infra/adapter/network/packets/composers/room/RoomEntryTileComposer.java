package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomEntryTileMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomEntryTile packet for client.
 */
@ComposesPacket(Outgoing.ROOM_MODEL_DOOR)
public class RoomEntryTileComposer extends PacketComposer<RoomEntryTileMessage> {
@Override
    protected void write(PacketBuffer packet, RoomEntryTileMessage message) {
        packet.appendInt(message.x());
        packet.appendInt(message.y());
        packet.appendInt(message.direction());
    }
}
