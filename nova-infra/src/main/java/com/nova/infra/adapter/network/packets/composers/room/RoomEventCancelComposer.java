package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomEventCancelMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomEventCancel packet for client.
 */
@ComposesPacket(Outgoing.ROOM_EVENT_CANCEL)
public class RoomEventCancelComposer extends PacketComposer<RoomEventCancelMessage> {
@Override
    protected void write(PacketBuffer packet, RoomEventCancelMessage message) {
        // No fields to write
    }
}
