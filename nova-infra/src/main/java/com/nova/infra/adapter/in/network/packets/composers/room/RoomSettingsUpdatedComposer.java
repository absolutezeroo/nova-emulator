package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomSettingsUpdatedMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomSettingsUpdated packet for client.
 */
@ComposesPacket(Outgoing.ROOM_INFO_UPDATED)
public class RoomSettingsUpdatedComposer extends PacketComposer<RoomSettingsUpdatedMessage> {
@Override
    protected void write(PacketBuffer packet, RoomSettingsUpdatedMessage message) {
        packet.appendInt(message.roomId());
    }
}
