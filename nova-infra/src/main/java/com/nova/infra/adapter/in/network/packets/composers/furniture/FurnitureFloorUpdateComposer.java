package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureFloorUpdateMessage;

/**
 * Composes FurnitureFloorUpdate packet for client.
 */
public class FurnitureFloorUpdateComposer extends PacketComposer<FurnitureFloorUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_FLOOR_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureFloorUpdateMessage message) {
        // No fields to write
    }
}
