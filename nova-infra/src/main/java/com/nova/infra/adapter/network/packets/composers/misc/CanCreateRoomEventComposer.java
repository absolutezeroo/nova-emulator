package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.CanCreateRoomEventMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes CanCreateRoomEvent packet for client.
 */
@ComposesPacket(Outgoing.CAN_CREATE_ROOM_EVENT)
public class CanCreateRoomEventComposer extends PacketComposer<CanCreateRoomEventMessage> {
@Override
    protected void write(PacketBuffer packet, CanCreateRoomEventMessage message) {
        packet.appendBoolean(message.canCreate());
        packet.appendInt(message.errorCode());
    }
}
