package com.nova.infra.adapter.in.network.packets.composers.unit;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.unit.RoomUnitChatMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnitChat packet for client.
 */
@ComposesPacket(Outgoing.UNIT_CHAT)
public class RoomUnitChatComposer extends PacketComposer<RoomUnitChatMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitChatMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendString(message.message());
        packet.appendInt(message.gesture());
        packet.appendInt(message.bubble());
        packet.appendInt(message.messageLength());
    }
}
