package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitNumberMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitNumber packet for client.
 */
@ComposesPacket(Outgoing.UNIT_NUMBER)
public class RoomUnitNumberComposer extends PacketComposer<RoomUnitNumberMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitNumberMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.value());
    }
}
