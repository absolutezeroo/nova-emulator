package com.nova.infra.adapter.network.packets.composers.furniture;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.furniture.FurnitureFloorRemoveMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes FurnitureFloorRemove packet for client.
 */
@ComposesPacket(Outgoing.FURNITURE_FLOOR_REMOVE)
public class FurnitureFloorRemoveComposer extends PacketComposer<FurnitureFloorRemoveMessage> {
@Override
    protected void write(PacketBuffer packet, FurnitureFloorRemoveMessage message) {
        packet.appendBoolean(message.isExpired());
        packet.appendInt(message.userId());
        packet.appendInt(message.delay());
    }
}
