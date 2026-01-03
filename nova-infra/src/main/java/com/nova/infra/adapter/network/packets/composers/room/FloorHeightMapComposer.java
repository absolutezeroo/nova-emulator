package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.FloorHeightMapMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FloorHeightMap packet for client.
 */
@ComposesPacket(Outgoing.ROOM_MODEL)
public class FloorHeightMapComposer extends PacketComposer<FloorHeightMapMessage> {
@Override
    protected void write(PacketBuffer packet, FloorHeightMapMessage message) {
        // No fields to write
    }
}
