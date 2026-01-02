package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.ObjectsRollingMessage;

/**
 * Composes ObjectsRolling packet for client.
 */
public class ObjectsRollingComposer extends PacketComposer<ObjectsRollingMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_ROLLING;
    }

    @Override
    protected void write(PacketBuffer packet, ObjectsRollingMessage message) {
        // No fields to write
    }
}
