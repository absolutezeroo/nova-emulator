package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsErrorMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomSettingsError packet for client.
 */
@ComposesPacket(Outgoing.ROOM_SETTINGS_ERROR)
public class RoomSettingsErrorComposer extends PacketComposer<RoomSettingsErrorMessage> {
@Override
    protected void write(PacketBuffer packet, RoomSettingsErrorMessage message) {
        packet.appendInt(message.roomId());
        packet.appendInt(message.code());
    }
}
