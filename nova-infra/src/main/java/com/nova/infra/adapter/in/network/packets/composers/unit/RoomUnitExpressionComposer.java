package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitExpressionMessage;

/**
 * Composes RoomUnitExpression packet for client.
 */
public class RoomUnitExpressionComposer extends PacketComposer<RoomUnitExpressionMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_EXPRESSION;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitExpressionMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.expression());
    }
}
