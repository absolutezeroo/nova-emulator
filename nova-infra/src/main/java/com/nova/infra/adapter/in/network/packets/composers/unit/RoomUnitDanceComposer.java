package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitDanceMessage;

/**
 * Composes RoomUnitDance packet for client.
 */
public class RoomUnitDanceComposer extends PacketComposer<RoomUnitDanceMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_DANCE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitDanceMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.danceId());
    }
}
