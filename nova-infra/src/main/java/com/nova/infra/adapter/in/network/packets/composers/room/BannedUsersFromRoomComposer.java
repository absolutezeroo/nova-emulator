package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.BannedUsersFromRoomMessage;

/**
 * Composes BannedUsersFromRoom packet for client.
 */
public class BannedUsersFromRoomComposer extends PacketComposer<BannedUsersFromRoomMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_BAN_LIST;
    }

    @Override
    protected void write(PacketBuffer packet, BannedUsersFromRoomMessage message) {
        packet.appendInt(message.roomId());
    }
}
