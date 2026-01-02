package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CanCreateRoomMessage;

/**
 * Composes CanCreateRoom packet for client.
 */
public class CanCreateRoomComposer extends PacketComposer<CanCreateRoomMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAN_CREATE_ROOM;
    }

    @Override
    protected void write(PacketBuffer packet, CanCreateRoomMessage message) {
        packet.appendBoolean(message.canCreate());
        packet.appendInt(message.errorCode());
    }
}
