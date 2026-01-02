package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureDataMessage;

/**
 * Composes FurnitureData packet for client.
 */
public class FurnitureDataComposer extends PacketComposer<FurnitureDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_DATA;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureDataMessage message) {
        // No fields to write
    }
}
