package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FurnitureWallAddMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureWallAdd packet for client.
 */
@ComposesPacket(Outgoing.ITEM_WALL_ADD)
public class FurnitureWallAddComposer extends PacketComposer<FurnitureWallAddMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureWallAddMessage message) {
        // No fields to write
    }
}
