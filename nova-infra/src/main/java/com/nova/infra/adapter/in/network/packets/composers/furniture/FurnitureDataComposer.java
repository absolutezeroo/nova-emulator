package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureDataMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureData packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_DATA)
public class FurnitureDataComposer extends PacketComposer<FurnitureDataMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureDataMessage message) {
        // No fields to write
    }
}
