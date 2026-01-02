package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitIdleMessage;

/**
 * Composes RoomUnitIdle packet for client.
 */
public class RoomUnitIdleComposer extends PacketComposer<RoomUnitIdleMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_IDLE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitIdleMessage message) {
        packet.appendInt(message.unitId());
        packet.appendBoolean(message.isIdle());
    }
}
