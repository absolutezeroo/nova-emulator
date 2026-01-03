package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomRightsMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomRights packet for client.
 */
@ComposesPacket(Outgoing.ROOM_RIGHTS)
public class RoomRightsComposer extends PacketComposer<RoomRightsMessage> {
@Override
    protected void write(PacketBuffer packet, RoomRightsMessage message) {
        packet.appendInt(message.controllerLevel());
    }
}
