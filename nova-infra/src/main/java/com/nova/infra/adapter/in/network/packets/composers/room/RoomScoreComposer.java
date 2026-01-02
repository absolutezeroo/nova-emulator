package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomScoreMessage;

/**
 * Composes RoomScore packet for client.
 */
public class RoomScoreComposer extends PacketComposer<RoomScoreMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SCORE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomScoreMessage message) {
        packet.appendInt(message.totalLikes());
        packet.appendBoolean(message.canLike());
    }
}
