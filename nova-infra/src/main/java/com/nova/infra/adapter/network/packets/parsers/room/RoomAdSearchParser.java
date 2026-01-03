package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomAdSearchMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomAdSearch packet from client.
 */
@ParsesPacket(Incoming.ROOM_AD_SEARCH)
public class RoomAdSearchParser extends PacketParser<RoomAdSearchMessageEvent> {
@Override
    public RoomAdSearchMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomAdSearchMessageEvent();
    }
}
