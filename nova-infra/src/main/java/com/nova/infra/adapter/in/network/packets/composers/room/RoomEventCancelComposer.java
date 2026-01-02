package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomEventCancelMessage;

/**
 * Composes RoomEventCancel packet for client.
 */
public class RoomEventCancelComposer extends PacketComposer<RoomEventCancelMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_EVENT_CANCEL;
    }

    @Override
    protected void write(PacketBuffer packet, RoomEventCancelMessage message) {
        // No fields to write
    }
}
