package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FurnitureWallRemoveMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureWallRemove packet for client.
 */
@ComposesPacket(Outgoing.ITEM_WALL_REMOVE)
public class FurnitureWallRemoveComposer extends PacketComposer<FurnitureWallRemoveMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureWallRemoveMessage message) {
        packet.appendInt(message.userId());
    }
}
