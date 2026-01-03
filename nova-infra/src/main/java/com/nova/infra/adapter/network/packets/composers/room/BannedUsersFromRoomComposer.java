package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.BannedUsersFromRoomMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes BannedUsersFromRoom packet for client.
 */
@ComposesPacket(Outgoing.ROOM_BAN_LIST)
public class BannedUsersFromRoomComposer extends PacketComposer<BannedUsersFromRoomMessage> {
@Override
    protected void write(PacketBuffer packet, BannedUsersFromRoomMessage message) {
        packet.appendInt(message.roomId());
    }
}
