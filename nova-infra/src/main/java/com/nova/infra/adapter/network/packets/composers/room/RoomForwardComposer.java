package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomForwardMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomForward packet for client.
 */
@ComposesPacket(Outgoing.ROOM_FORWARD)
public class RoomForwardComposer extends PacketComposer<RoomForwardMessage> {
@Override
    protected void write(PacketBuffer packet, RoomForwardMessage message) {
        // No fields to write
    }
}
