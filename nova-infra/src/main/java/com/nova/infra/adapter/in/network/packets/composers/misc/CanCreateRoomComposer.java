package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CanCreateRoomMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes CanCreateRoom packet for client.
 */
@ComposesPacket(Outgoing.CAN_CREATE_ROOM)
public class CanCreateRoomComposer extends PacketComposer<CanCreateRoomMessage> {
@Override
    protected void write(PacketBuffer packet, CanCreateRoomMessage message) {
        packet.appendBoolean(message.canCreate());
        packet.appendInt(message.errorCode());
    }
}
