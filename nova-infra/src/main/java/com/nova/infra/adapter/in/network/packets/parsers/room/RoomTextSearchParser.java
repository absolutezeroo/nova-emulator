package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomTextSearchMessageEvent;

/**
 * Parses RoomTextSearch packet from client.
 */
public class RoomTextSearchParser extends PacketParser<RoomTextSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_TEXT_SEARCH;
    }

    @Override
    public RoomTextSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomTextSearchMessageEvent();
    }
}
