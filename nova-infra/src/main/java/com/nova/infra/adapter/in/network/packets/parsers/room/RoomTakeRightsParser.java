package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomTakeRightsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomTakeRights packet from client.
 */
@ParsesPacket(Incoming.ROOM_RIGHTS_REMOVE)
public class RoomTakeRightsParser extends PacketParser<RoomTakeRightsMessageEvent> {
@Override
    public RoomTakeRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomTakeRightsMessageEvent();
    }
}
