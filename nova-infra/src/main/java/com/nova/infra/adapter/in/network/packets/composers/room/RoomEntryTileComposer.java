package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEntryTileMessage;

/**
 * Composes RoomEntryTile packet for client.
 */
public class RoomEntryTileComposer extends PacketComposer<RoomEntryTileMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_MODEL_DOOR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomEntryTileMessage message) {
        packet.appendInt(message.x());
        packet.appendInt(message.y());
        packet.appendInt(message.direction());
    }
}
