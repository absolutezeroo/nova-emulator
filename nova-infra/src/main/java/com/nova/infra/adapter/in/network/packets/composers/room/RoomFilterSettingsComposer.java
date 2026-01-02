package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomFilterSettingsMessage;

/**
 * Composes RoomFilterSettings packet for client.
 */
public class RoomFilterSettingsComposer extends PacketComposer<RoomFilterSettingsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_GET_FILTER_WORDS;
    }

    @Override
    protected void write(PacketBuffer packet, RoomFilterSettingsMessage message) {
        // No fields to write
    }
}
