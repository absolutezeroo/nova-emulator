package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomEventMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomEvent packet for client.
 */
@ComposesPacket(Outgoing.ROOM_EVENT)
public class RoomEventComposer extends PacketComposer<RoomEventMessage> {
@Override
    protected void write(PacketBuffer packet, RoomEventMessage message) {
        packet.appendBoolean(message.canCreate());
        packet.appendInt(message.errorCode());
    }
}
