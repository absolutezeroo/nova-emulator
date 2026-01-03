package com.nova.infra.adapter.network.packets.composers.room;

import com.nova.infra.adapter.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.network.packets.headers.Outgoing;
import com.nova.infra.adapter.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.network.packets.outgoing.room.RoomSettingsSaveErrorMessage;
import com.nova.infra.adapter.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomSettingsSaveError packet for client.
 */
@ComposesPacket(Outgoing.ROOM_SETTINGS_SAVE_ERROR)
public class RoomSettingsSaveErrorComposer extends PacketComposer<RoomSettingsSaveErrorMessage> {
@Override
    protected void write(PacketBuffer packet, RoomSettingsSaveErrorMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.code());
        packet.appendString(message.message());
    }
}
