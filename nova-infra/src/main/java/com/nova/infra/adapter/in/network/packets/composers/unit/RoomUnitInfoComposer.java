package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitInfoMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitInfo packet for client.
 */
@ComposesPacket(Outgoing.UNIT_INFO)
public class RoomUnitInfoComposer extends PacketComposer<RoomUnitInfoMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitInfoMessage message) {
        packet.appendInt(message.unitId());
        packet.appendString(message.figure());
        packet.appendString(message.gender());
        packet.appendString(message.motto());
        packet.appendInt(message.achievementScore());
    }
}
