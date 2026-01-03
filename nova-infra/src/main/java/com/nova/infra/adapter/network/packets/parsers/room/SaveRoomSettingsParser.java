package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.SaveRoomSettingsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses SaveRoomSettings packet from client.
 */
@ParsesPacket(Incoming.ROOM_SETTINGS_SAVE)
public class SaveRoomSettingsParser extends PacketParser<SaveRoomSettingsMessageEvent> {
@Override
    public SaveRoomSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new SaveRoomSettingsMessageEvent();
    }
}
