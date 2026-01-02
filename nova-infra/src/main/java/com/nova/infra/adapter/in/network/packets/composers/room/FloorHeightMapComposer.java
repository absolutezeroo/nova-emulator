package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.FloorHeightMapMessage;

/**
 * Composes FloorHeightMap packet for client.
 */
public class FloorHeightMapComposer extends PacketComposer<FloorHeightMapMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_MODEL;
    }

    @Override
    protected void write(PacketBuffer packet, FloorHeightMapMessage message) {
        // No fields to write
    }
}
