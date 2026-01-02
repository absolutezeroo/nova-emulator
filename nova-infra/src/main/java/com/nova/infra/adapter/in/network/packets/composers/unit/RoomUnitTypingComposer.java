package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitTypingMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitTyping packet for client.
 */
@ComposesPacket(Outgoing.UNIT_TYPING)
public class RoomUnitTypingComposer extends PacketComposer<RoomUnitTypingMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitTypingMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.isTyping());
    }
}
