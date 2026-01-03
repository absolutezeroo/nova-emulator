package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomEntryInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomEntryInfo packet for client.
 */
@ComposesPacket(Outgoing.ROOM_INFO_OWNER)
public class RoomEntryInfoComposer extends PacketComposer<RoomEntryInfoMessage> {
@Override
    protected void write(PacketBuffer packet, RoomEntryInfoMessage message) {
        packet.appendInt(message.roomId());
        packet.appendBoolean(message.isOwner());
    }
}
