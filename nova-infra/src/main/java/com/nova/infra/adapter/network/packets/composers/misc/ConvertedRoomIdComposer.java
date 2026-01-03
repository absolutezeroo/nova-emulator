package com.nova.infra.adapter.network.packets.composers.misc;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.misc.ConvertedRoomIdMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes ConvertedRoomId packet for client.
 */
@ComposesPacket(Outgoing.CONVERTED_ROOM_ID)
public class ConvertedRoomIdComposer extends PacketComposer<ConvertedRoomIdMessage> {
@Override
    protected void write(PacketBuffer packet, ConvertedRoomIdMessage message) {
        packet.appendString(message.globalId());
        packet.appendInt(message.convertedId());
    }
}
