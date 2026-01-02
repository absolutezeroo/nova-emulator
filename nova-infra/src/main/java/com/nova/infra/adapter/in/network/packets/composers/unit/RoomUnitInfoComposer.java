package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitInfoMessage;

/**
 * Composes RoomUnitInfo packet for client.
 */
public class RoomUnitInfoComposer extends PacketComposer<RoomUnitInfoMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_INFO;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitInfoMessage message) {
        packet.appendInt(message.unitId());
        packet.appendString(message.figure());
        packet.appendString(message.gender());
        packet.appendString(message.motto());
        packet.appendInt(message.achievementScore());
    }
}
