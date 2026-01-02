package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurnitureWallAddMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

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
