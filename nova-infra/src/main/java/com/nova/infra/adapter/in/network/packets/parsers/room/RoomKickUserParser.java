package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomKickUserMessageEvent;

/**
 * Parses RoomKickUser packet from client.
 */
public class RoomKickUserParser extends PacketParser<RoomKickUserMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_KICK;
    }

    @Override
    public RoomKickUserMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomKickUserMessageEvent();
    }
}
