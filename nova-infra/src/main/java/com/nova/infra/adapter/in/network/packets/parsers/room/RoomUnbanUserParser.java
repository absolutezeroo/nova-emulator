package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomUnbanUserMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
