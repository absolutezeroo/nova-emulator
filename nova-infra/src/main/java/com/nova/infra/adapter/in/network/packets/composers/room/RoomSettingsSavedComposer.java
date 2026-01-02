package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsSavedMessage;

/**
 * Composes RoomSettingsSaved packet for client.
 */
public class RoomSettingsSavedComposer extends PacketComposer<RoomSettingsSavedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SETTINGS_SAVE;
    }

    @Override
    protected void write(PacketBuffer packet, RoomSettingsSavedMessage message) {
        packet.appendInt(message.roomId());
    }
}
