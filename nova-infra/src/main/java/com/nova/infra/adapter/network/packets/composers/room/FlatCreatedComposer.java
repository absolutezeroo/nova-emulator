package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.FlatCreatedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FlatCreated packet for client.
 */
@ComposesPacket(Outgoing.ROOM_CREATED)
public class FlatCreatedComposer extends PacketComposer<FlatCreatedMessage> {
@Override
    protected void write(PacketBuffer packet, FlatCreatedMessage message) {
        packet.appendInt(message.roomId());
        packet.appendString(message.roomName());
    }
}
