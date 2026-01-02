package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurnitureWallUpdateMessage;

/**
 * Composes FurnitureWallUpdate packet for client.
 */
public class FurnitureWallUpdateComposer extends PacketComposer<FurnitureWallUpdateMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ITEM_WALL_UPDATE;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureWallUpdateMessage message) {
        // No fields to write
    }
}
