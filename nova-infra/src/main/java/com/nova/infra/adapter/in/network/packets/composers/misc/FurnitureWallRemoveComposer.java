package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurnitureWallRemoveMessage;

/**
 * Composes FurnitureWallRemove packet for client.
 */
public class FurnitureWallRemoveComposer extends PacketComposer<FurnitureWallRemoveMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ITEM_WALL_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureWallRemoveMessage message) {
        packet.appendInt(message.userId());
    }
}
