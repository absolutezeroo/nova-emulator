package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomAdErrorMessage;

/**
 * Composes RoomAdError packet for client.
 */
public class RoomAdErrorComposer extends PacketComposer<RoomAdErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_AD_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomAdErrorMessage message) {
        packet.appendInt(message.errorCode());
        packet.appendString(message.filteredText());
    }
}
