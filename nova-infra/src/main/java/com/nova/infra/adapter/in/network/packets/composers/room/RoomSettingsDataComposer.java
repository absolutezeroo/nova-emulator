package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsDataMessage;

/**
 * Composes RoomSettingsData packet for client.
 */
public class RoomSettingsDataComposer extends PacketComposer<RoomSettingsDataMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SETTINGS;
    }

    @Override
    protected void write(PacketBuffer packet, RoomSettingsDataMessage message) {
        // No fields to write
    }
}
