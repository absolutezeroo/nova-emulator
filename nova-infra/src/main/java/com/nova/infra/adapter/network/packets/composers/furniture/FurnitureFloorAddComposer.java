package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.FurnitureFloorAddMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureFloorAdd packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_FLOOR_ADD)
public class FurnitureFloorAddComposer extends PacketComposer<FurnitureFloorAddMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureFloorAddMessage message) {
        // No fields to write
    }
}
