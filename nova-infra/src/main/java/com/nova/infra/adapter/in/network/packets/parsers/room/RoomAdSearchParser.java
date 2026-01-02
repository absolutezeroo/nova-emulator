package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomAdSearchMessageEvent;

/**
 * Parses RoomAdSearch packet from client.
 */
public class RoomAdSearchParser extends PacketParser<RoomAdSearchMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_AD_SEARCH;
    }

    @Override
    public RoomAdSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdSearchMessageEvent();
    }
}
