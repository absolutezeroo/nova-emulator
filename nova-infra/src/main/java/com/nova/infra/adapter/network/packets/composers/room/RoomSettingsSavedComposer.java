package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomSettingsSavedMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomSettingsSaved packet for client.
 */
@ComposesPacket(Outgoing.ROOM_SETTINGS_SAVE)
public class RoomSettingsSavedComposer extends PacketComposer<RoomSettingsSavedMessage> {
@Override
    protected void write(PacketBuffer packet, RoomSettingsSavedMessage message) {
        packet.appendInt(message.roomId());
    }
}
