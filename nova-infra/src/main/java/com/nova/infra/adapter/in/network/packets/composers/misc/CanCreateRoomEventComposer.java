package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.CanCreateRoomEventMessage;

/**
 * Composes CanCreateRoomEvent packet for client.
 */
public class CanCreateRoomEventComposer extends PacketComposer<CanCreateRoomEventMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CAN_CREATE_ROOM_EVENT;
    }

    @Override
    protected void write(PacketBuffer packet, CanCreateRoomEventMessage message) {
        packet.appendBoolean(message.canCreate());
        packet.appendInt(message.errorCode());
    }
}
