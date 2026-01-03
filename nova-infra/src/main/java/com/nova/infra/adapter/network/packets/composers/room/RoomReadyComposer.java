package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomReadyMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomReady packet for client.
 */
@ComposesPacket(Outgoing.ROOM_MODEL_NAME)
public class RoomReadyComposer extends PacketComposer<RoomReadyMessage> {
@Override
    protected void write(PacketBuffer packet, RoomReadyMessage message) {
        packet.appendString(message.name());
        packet.appendInt(message.roomId());
    }
}
