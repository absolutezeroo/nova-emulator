package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomDeleteMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
