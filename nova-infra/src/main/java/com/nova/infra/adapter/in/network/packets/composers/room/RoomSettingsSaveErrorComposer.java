package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsSaveErrorMessage;

/**
 * Composes RoomSettingsSaveError packet for client.
 */
public class RoomSettingsSaveErrorComposer extends PacketComposer<RoomSettingsSaveErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SETTINGS_SAVE_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomSettingsSaveErrorMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.code());
        packet.appendString(message.message());
    }
}
