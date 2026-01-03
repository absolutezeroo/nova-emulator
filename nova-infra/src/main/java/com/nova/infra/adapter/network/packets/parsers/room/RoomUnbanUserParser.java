package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomUnbanUserMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUnbanUser packet from client.
 */
@ParsesPacket(Incoming.ROOM_BAN_REMOVE)
public class RoomUnbanUserParser extends PacketParser<RoomUnbanUserMessageEvent> {
@Override
    public RoomUnbanUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnbanUserMessageEvent();
    }
}
