package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.UserUnbannedFromRoomMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes UserUnbannedFromRoom packet for client.
 */
@ComposesPacket(Outgoing.ROOM_BAN_REMOVE)
public class UserUnbannedFromRoomComposer extends PacketComposer<UserUnbannedFromRoomMessage> {
@Override
    protected void write(PacketBuffer packet, UserUnbannedFromRoomMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.userId());
    }
}
