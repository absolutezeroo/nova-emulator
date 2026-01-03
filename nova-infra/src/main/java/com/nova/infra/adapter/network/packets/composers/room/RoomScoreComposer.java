package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomScoreMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomScore packet for client.
 */
@ComposesPacket(Outgoing.ROOM_SCORE)
public class RoomScoreComposer extends PacketComposer<RoomScoreMessage> {
@Override
    protected void write(PacketBuffer packet, RoomScoreMessage message) {
        packet.appendInt(message.totalLikes());
        packet.appendBoolean(message.canLike());
    }
}
