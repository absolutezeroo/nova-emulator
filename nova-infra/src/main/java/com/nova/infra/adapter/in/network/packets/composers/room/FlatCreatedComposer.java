package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FlatCreatedMessage;

/**
 * Composes FlatCreated packet for client.
 */
public class FlatCreatedComposer extends PacketComposer<FlatCreatedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_CREATED;
    }

    @Override
    protected void write(PacketBuffer packet, FlatCreatedMessage message) {
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
    }
}
