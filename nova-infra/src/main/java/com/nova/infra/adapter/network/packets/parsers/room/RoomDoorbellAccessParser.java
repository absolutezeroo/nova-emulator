package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomDoorbellAccessMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomDoorbellAccess packet from client.
 */
@ParsesPacket(Incoming.ROOM_DOORBELL)
public class RoomDoorbellAccessParser extends PacketParser<RoomDoorbellAccessMessageEvent> {
@Override
    public RoomDoorbellAccessMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomDoorbellAccessMessageEvent();
    }
}
