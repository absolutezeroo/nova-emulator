package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.FurnitureWallMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureWall packet for client.
 */
@ComposesPacket(Outgoing.ITEM_WALL)
public class FurnitureWallComposer extends PacketComposer<FurnitureWallMessage> {
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
