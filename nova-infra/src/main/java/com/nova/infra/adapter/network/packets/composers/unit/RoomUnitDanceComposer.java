package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitDanceMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitDance packet for client.
 */
@ComposesPacket(Outgoing.UNIT_DANCE)
public class RoomUnitDanceComposer extends PacketComposer<RoomUnitDanceMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitDanceMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.danceId());
    }
}
