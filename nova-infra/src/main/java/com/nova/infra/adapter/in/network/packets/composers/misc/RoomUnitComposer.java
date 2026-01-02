package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.RoomUnitMessage;

/**
 * Composes RoomUnit packet for client.
 */
public class RoomUnitComposer extends PacketComposer<RoomUnitMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.UNIT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomUnitMessage message) {
        packet.appendInt(message.roomIndex());
        packet.appendString(message.message());
        packet.appendInt(message.gesture());
        packet.appendInt(message.bubble());
        packet.appendInt(message.messageLength());
    }
}
