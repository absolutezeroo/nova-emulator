package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitHandItemMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitHandItem packet for client.
 */
@ComposesPacket(Outgoing.UNIT_HAND_ITEM)
public class RoomUnitHandItemComposer extends PacketComposer<RoomUnitHandItemMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitHandItemMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.handId());
    }
}
