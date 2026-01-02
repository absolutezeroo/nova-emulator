package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomRightsMessage;

/**
 * Composes RoomRights packet for client.
 */
public class RoomRightsComposer extends PacketComposer<RoomRightsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_RIGHTS;
    }

    @Override
    protected void write(PacketBuffer packet, RoomRightsMessage message) {
        packet.appendInt(message.controllerLevel());
    }
}
