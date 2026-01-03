package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomDoorbellAcceptedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomDoorbellAccepted packet for client.
 */
@ComposesPacket(Outgoing.ROOM_DOORBELL_ACCEPTED)
public class RoomDoorbellAcceptedComposer extends PacketComposer<RoomDoorbellAcceptedMessage> {
@Override
    protected void write(PacketBuffer packet, RoomDoorbellAcceptedMessage message) {
        packet.appendString(message.userName());
    }
}
