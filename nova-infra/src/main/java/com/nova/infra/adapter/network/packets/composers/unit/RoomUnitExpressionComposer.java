package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitExpressionMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitExpression packet for client.
 */
@ComposesPacket(Outgoing.UNIT_EXPRESSION)
public class RoomUnitExpressionComposer extends PacketComposer<RoomUnitExpressionMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitExpressionMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.expression());
    }
}
