package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.FurnitureWallMessage;

/**
 * Composes FurnitureWall packet for client.
 */
public class FurnitureWallComposer extends PacketComposer<FurnitureWallMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ITEM_WALL;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureWallMessage message) {
        packet.appendInt(message.spriteId());
        packet.appendString(message.location());
        packet.appendString(message.stuffData());
        packet.appendInt(message.secondsToExpiration());
        packet.appendInt(message.usagePolicy());
        packet.appendInt(message.userId());
    }
}
