package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.UserUnbannedFromRoomMessage;

/**
 * Composes UserUnbannedFromRoom packet for client.
 */
public class UserUnbannedFromRoomComposer extends PacketComposer<UserUnbannedFromRoomMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_BAN_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, UserUnbannedFromRoomMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.userId());
    }
}
