package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureFloorMessage;

/**
 * Composes FurnitureFloor packet for client.
 */
public class FurnitureFloorComposer extends PacketComposer<FurnitureFloorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_FLOOR;
    }

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
