package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomDeleteMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomDelete packet from client.
 */
@ParsesPacket(Incoming.ROOM_DELETE)
public class RoomDeleteParser extends PacketParser<RoomDeleteMessageEvent> {
@Override
    public RoomDeleteMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomDeleteMessageEvent();
    }
}
