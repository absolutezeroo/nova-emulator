package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsUpdatedMessage;

/**
 * Composes RoomSettingsUpdated packet for client.
 */
public class RoomSettingsUpdatedComposer extends PacketComposer<RoomSettingsUpdatedMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_INFO_UPDATED;
    }

    @Override
    protected void write(PacketBuffer packet, RoomSettingsUpdatedMessage message) {
        packet.appendInt(message.roomId());
    }
}
