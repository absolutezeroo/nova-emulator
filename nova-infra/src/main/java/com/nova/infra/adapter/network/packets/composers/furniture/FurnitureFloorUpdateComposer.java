package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.FurnitureFloorUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureFloorUpdate packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_FLOOR_UPDATE)
public class FurnitureFloorUpdateComposer extends PacketComposer<FurnitureFloorUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureFloorUpdateMessage message) {
        // No fields to write
    }
}
