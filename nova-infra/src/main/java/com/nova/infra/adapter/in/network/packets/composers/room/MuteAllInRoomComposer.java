package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.MuteAllInRoomMessage;

/**
 * Composes MuteAllInRoom packet for client.
 */
public class MuteAllInRoomComposer extends PacketComposer<MuteAllInRoomMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_MUTED;
    }

    @Override
    protected void write(PacketBuffer packet, MuteAllInRoomMessage message) {
        packet.appendBoolean(message.isMuted());
    }
}
