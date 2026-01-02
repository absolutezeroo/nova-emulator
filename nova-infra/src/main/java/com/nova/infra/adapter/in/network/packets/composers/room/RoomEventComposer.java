package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEventMessage;

/**
 * Composes RoomEvent packet for client.
 */
public class RoomEventComposer extends PacketComposer<RoomEventMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_EVENT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomEventMessage message) {
        packet.appendBoolean(message.canCreate());
        packet.appendInt(message.errorCode());
    }
}
