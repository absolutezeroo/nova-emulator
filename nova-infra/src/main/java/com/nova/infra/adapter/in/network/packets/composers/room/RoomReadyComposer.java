package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomReadyMessage;

/**
 * Composes RoomReady packet for client.
 */
public class RoomReadyComposer extends PacketComposer<RoomReadyMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_MODEL_NAME;
    }

    @Override
    protected void write(PacketBuffer packet, RoomReadyMessage message) {
        packet.appendString(message.name());
        packet.appendInt(message.roomId());
    }
}
