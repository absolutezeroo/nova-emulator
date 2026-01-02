package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEntryInfoMessage;

/**
 * Composes RoomEntryInfo packet for client.
 */
public class RoomEntryInfoComposer extends PacketComposer<RoomEntryInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_INFO_OWNER;
    }

    @Override
    protected void write(PacketBuffer packet, RoomEntryInfoMessage message) {
        packet.appendInt(message.roomId());
        packet.appendBoolean(message.isOwner());
    }
}
