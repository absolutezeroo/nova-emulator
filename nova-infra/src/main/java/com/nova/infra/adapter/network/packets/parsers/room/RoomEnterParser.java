package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomEnterMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
