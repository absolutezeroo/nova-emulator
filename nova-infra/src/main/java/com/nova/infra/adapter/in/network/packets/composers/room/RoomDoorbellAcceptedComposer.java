package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomDoorbellAcceptedMessage;

/**
 * Composes RoomDoorbellAccepted packet for client.
 */
public class RoomDoorbellAcceptedComposer extends PacketComposer<RoomDoorbellAcceptedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_DOORBELL_ACCEPTED;
    }

    @Override
    protected void write(PacketBuffer packet, RoomDoorbellAcceptedMessage message) {
        packet.appendString(message.userName());
    }
}
