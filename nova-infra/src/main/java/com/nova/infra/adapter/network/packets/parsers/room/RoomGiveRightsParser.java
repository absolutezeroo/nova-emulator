package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomGiveRightsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
