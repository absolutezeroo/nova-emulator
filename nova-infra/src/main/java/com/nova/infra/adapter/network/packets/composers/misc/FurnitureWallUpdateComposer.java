package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FurnitureWallUpdateMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureWallUpdate packet for client.
 */
@ComposesPacket(Outgoing.ITEM_WALL_UPDATE)
public class FurnitureWallUpdateComposer extends PacketComposer<FurnitureWallUpdateMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureWallUpdateMessage message) {
        // No fields to write
    }
}
