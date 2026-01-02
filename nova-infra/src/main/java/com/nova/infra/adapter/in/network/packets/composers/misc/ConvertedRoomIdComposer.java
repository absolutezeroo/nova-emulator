package com.nova.infra.adapter.in.network.packets.composers.misc;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.misc.ConvertedRoomIdMessage;

/**
 * Composes ConvertedRoomId packet for client.
 */
public class ConvertedRoomIdComposer extends PacketComposer<ConvertedRoomIdMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.CONVERTED_ROOM_ID;
    }

    @Override
    protected void write(PacketBuffer packet, ConvertedRoomIdMessage message) {
        packet.appendString(message.globalId());
        packet.appendInt(message.convertedId());
    }
}
