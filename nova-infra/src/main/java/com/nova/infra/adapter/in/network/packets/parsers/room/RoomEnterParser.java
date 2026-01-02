package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomEnterMessageEvent;

/**
 * Parses RoomEnter packet from client.
 */
public class RoomEnterParser extends PacketParser<RoomEnterMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_ENTER;
    }

    @Override
    public RoomEnterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomEnterMessageEvent();
    }
}
