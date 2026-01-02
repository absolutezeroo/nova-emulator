package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomEnterMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomEnter packet from client.
 */
@ParsesPacket(Incoming.ROOM_ENTER)
public class RoomEnterParser extends PacketParser<RoomEnterMessageEvent> {
@Override
    public RoomEnterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomEnterMessageEvent();
    }
}
