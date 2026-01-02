package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsErrorMessage;

/**
 * Composes RoomSettingsError packet for client.
 */
public class RoomSettingsErrorComposer extends PacketComposer<RoomSettingsErrorMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SETTINGS_ERROR;
    }

    @Override
    protected void write(PacketBuffer packet, RoomSettingsErrorMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.code());
    }
}
