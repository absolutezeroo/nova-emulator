package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitNumberMessage;

/**
 * Composes RoomUnitNumber packet for client.
 */
public class RoomUnitNumberComposer extends PacketComposer<RoomUnitNumberMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_NUMBER;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitNumberMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.value());
    }
}
