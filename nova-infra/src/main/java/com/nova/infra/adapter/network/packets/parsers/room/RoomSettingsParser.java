package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomSettingsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomSettings packet from client.
 */
@ParsesPacket(Incoming.ROOM_SETTINGS)
public class RoomSettingsParser extends PacketParser<RoomSettingsMessageEvent> {
@Override
    public RoomSettingsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomSettingsMessageEvent();
    }
}
