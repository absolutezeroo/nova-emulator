package com.nova.infra.adapter.network.packets.composers.unit;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.unit.RoomUnitTypingMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

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
