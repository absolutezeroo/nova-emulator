package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.RoomUnitMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomUnit packet for client.
 */
@ComposesPacket(Outgoing.UNIT)
public class RoomUnitComposer extends PacketComposer<RoomUnitMessage> {
@Override
    protected void write(PacketBuffer packet, RoomUnitMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendString(message.message());
        packet.appendInt(message.gesture());
        packet.appendInt(message.bubble());
        packet.appendInt(message.messageLength());
    }
}
