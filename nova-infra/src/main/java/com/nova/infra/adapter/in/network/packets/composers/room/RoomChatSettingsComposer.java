package com.nova.infra.adapter.in.network.packets.composers.room;

import com.nova.infra.adapter.in.network.packets.composers.PacketComposer;
import com.nova.infra.adapter.in.network.packets.headers.Outgoing;
import com.nova.infra.adapter.in.network.packets.outgoing.PacketBuffer;
import com.nova.infra.adapter.in.network.packets.outgoing.room.RoomChatSettingsMessage;

/**
 * Composes RoomChatSettings packet for client.
 */
public class RoomChatSettingsComposer extends PacketComposer<RoomChatSettingsMessage> {

    @Override
    public int getPacketId() {
        return Outgoing.ROOM_SETTINGS_CHAT;
    }

    @Override
    protected void write(PacketBuffer packet, RoomChatSettingsMessage message) {
        // No fields to write
    }
}
