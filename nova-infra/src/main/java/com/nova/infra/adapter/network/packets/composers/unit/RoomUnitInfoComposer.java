package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitInfoMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
