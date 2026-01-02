package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureFloorAddMessage;

/**
 * Composes FurnitureFloorAdd packet for client.
 */
public class FurnitureFloorAddComposer extends PacketComposer<FurnitureFloorAddMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_FLOOR_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureFloorAddMessage message) {
        // No fields to write
    }
}
