package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomEnterErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomEnterError packet for client.
 */
@ComposesPacket(Outgoing.ROOM_ENTER_ERROR)
public class RoomEnterErrorComposer extends PacketComposer<RoomEnterErrorMessage> {
@Override
    protected void write(PacketBuffer packet, RoomEnterErrorMessage message) {
        // No fields to write
    }
}
