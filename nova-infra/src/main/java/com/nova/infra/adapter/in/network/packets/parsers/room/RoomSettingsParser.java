package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomSettingsMessageEvent;

/**
 * Parses RoomSettings packet from client.
 */
public class RoomSettingsParser extends PacketParser<RoomSettingsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_SETTINGS;
    }

    @Override
    public RoomSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomSettingsMessageEvent();
    }
}
