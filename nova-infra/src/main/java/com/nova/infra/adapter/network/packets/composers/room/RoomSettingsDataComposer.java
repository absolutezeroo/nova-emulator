package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomSettingsDataMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomSettingsData packet for client.
 */
@ComposesPacket(Outgoing.ROOM_SETTINGS)
public class RoomSettingsDataComposer extends PacketComposer<RoomSettingsDataMessage> {
@Override
    protected void write(PacketBuffer packet, RoomSettingsDataMessage message) {
        // No fields to write
    }
}
