package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.FurnitureFloorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureFloor packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_FLOOR)
public class FurnitureFloorComposer extends PacketComposer<FurnitureFloorMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureFloorMessage message) {
        packet.appendInt(message.itemId());
        packet.appendInt(message.spriteId());
        packet.appendInt(message.x());
        packet.appendInt(message.y());
        packet.appendInt(message.extra());
        packet.appendInt(message.expires());
        packet.appendInt(message.usagePolicy());
        packet.appendInt(message.userId());
        packet.appendString(message.spriteName());
    }
}
