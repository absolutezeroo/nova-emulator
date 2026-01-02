package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurnitureWallAddMessage;

/**
 * Composes FurnitureWallAdd packet for client.
 */
public class FurnitureWallAddComposer extends PacketComposer<FurnitureWallAddMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ITEM_WALL_ADD;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureWallAddMessage message) {
        // No fields to write
    }
}
