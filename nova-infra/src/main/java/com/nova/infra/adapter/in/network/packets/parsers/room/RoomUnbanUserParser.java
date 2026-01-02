package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomUnbanUserMessageEvent;

/**
 * Parses RoomUnbanUser packet from client.
 */
public class RoomUnbanUserParser extends PacketParser<RoomUnbanUserMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_BAN_REMOVE;
    }

    @Override
    public RoomUnbanUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUnbanUserMessageEvent();
    }
}
