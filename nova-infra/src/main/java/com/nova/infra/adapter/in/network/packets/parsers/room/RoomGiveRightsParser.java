package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomGiveRightsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomGiveRights packet from client.
 */
@ParsesPacket(Incoming.ROOM_RIGHTS_GIVE)
public class RoomGiveRightsParser extends PacketParser<RoomGiveRightsMessageEvent> {
@Override
    public RoomGiveRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomGiveRightsMessageEvent();
    }
}
