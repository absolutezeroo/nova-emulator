package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitIdleMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitIdle packet for client.
 */
@ComposesPacket(Outgoing.UNIT_IDLE)
public class RoomUnitIdleComposer extends PacketComposer<RoomUnitIdleMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitIdleMessage message) {
        packet.appendInt(message.unitId());
        packet.appendBoolean(message.isIdle());
    }
}
