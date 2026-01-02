package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitHandItemMessage;

/**
 * Composes RoomUnitHandItem packet for client.
 */
public class RoomUnitHandItemComposer extends PacketComposer<RoomUnitHandItemMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_HAND_ITEM;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitHandItemMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.handId());
    }
}
