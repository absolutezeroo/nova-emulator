package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomFilterSettingsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomFilterSettings packet for client.
 */
@ComposesPacket(Outgoing.ROOM_GET_FILTER_WORDS)
public class RoomFilterSettingsComposer extends PacketComposer<RoomFilterSettingsMessage> {
@Override
    protected void write(PacketBuffer packet, RoomFilterSettingsMessage message) {
        // No fields to write
    }
}
