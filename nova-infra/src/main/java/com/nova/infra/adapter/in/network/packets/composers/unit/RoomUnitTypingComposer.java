package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitTypingMessage;

/**
 * Composes RoomUnitTyping packet for client.
 */
public class RoomUnitTypingComposer extends PacketComposer<RoomUnitTypingMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT_TYPING;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitTypingMessage message) {
        packet.appendInt(message.unitId());
        packet.appendInt(message.isTyping());
    }
}
