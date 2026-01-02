package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomAdErrorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomAdError packet for client.
 */
@ComposesPacket(Outgoing.ROOM_AD_ERROR)
public class RoomAdErrorComposer extends PacketComposer<RoomAdErrorMessage> {
@Override
    protected void write(PacketBuffer packet, RoomAdErrorMessage message) {
        packet.appendInt(message.errorCode());
        packet.appendString(message.filteredText());
    }
}
