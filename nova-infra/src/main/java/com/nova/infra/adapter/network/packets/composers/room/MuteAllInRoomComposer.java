package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.MuteAllInRoomMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes MuteAllInRoom packet for client.
 */
@ComposesPacket(Outgoing.ROOM_MUTED)
public class MuteAllInRoomComposer extends PacketComposer<MuteAllInRoomMessage> {
@Override
    protected void write(PacketBuffer packet, MuteAllInRoomMessage message) {
        packet.appendBoolean(message.isMuted());
    }
}
