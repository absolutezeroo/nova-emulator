package com.nova.infra.adapter.in.network.packets.composers.furniture;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.furniture.FurnitureFloorRemoveMessage;

/**
 * Composes FurnitureFloorRemove packet for client.
 */
public class FurnitureFloorRemoveComposer extends PacketComposer<FurnitureFloorRemoveMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.FURNITURE_FLOOR_REMOVE;
    }

    @Override
    protected void write(PacketBuffer packet, FurnitureFloorRemoveMessage message) {
        packet.appendBoolean(message.isExpired());
        packet.appendInt(message.userId());
        packet.appendInt(message.delay());
    }
}
