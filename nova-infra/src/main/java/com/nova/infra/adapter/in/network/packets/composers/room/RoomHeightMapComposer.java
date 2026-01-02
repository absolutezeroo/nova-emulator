package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomHeightMapMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomHeightMap packet for client.
 */
@ComposesPacket(Outgoing.ROOM_HEIGHT_MAP)
public class RoomHeightMapComposer extends PacketComposer<RoomHeightMapMessage> {
@Override
    protected void write(PacketBuffer packet, RoomHeightMapMessage message) {
        packet.appendInt(message.width());
    }
}
