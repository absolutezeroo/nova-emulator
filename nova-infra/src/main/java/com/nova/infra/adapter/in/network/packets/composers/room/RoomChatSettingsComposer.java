package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomChatSettingsMessage;
import com.nova.infra.adapter.in.network.packets.annotations.ComposesPacket;

/**
 * Composes RoomChatSettings packet for client.
 */
@ComposesPacket(Outgoing.ROOM_SETTINGS_CHAT)
public class RoomChatSettingsComposer extends PacketComposer<RoomChatSettingsMessage> {
@Override
    protected void write(PacketBuffer packet, RoomChatSettingsMessage message) {
        // No fields to write
    }
}
