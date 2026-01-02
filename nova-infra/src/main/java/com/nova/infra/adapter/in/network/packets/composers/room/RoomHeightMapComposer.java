package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomHeightMapMessage;

/**
 * Composes RoomHeightMap packet for client.
 */
public class RoomHeightMapComposer extends PacketComposer<RoomHeightMapMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_HEIGHT_MAP;
    }

    @Override
    protected void write(PacketBuffer packet, RoomHeightMapMessage message) {
        packet.appendInt(message.width());
    }
}
