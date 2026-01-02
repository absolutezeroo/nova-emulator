package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomDoorbellAccessMessageEvent;

/**
 * Parses RoomDoorbellAccess packet from client.
 */
public class RoomDoorbellAccessParser extends PacketParser<RoomDoorbellAccessMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_DOORBELL;
    }

    @Override
    public RoomDoorbellAccessMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomDoorbellAccessMessageEvent();
    }
}
