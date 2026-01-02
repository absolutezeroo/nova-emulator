package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.ObjectsRollingMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes ObjectsRolling packet for client.
 */
@ComposesPacket(Outgoing.ROOM_ROLLING)
public class ObjectsRollingComposer extends PacketComposer<ObjectsRollingMessage> {
@Override
    protected void write(PacketBuffer packet, ObjectsRollingMessage message) {
        // No fields to write
    }
}
