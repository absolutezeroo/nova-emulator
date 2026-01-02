package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomUsersWithRightsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomUsersWithRights packet from client.
 */
@ParsesPacket(Incoming.ROOM_RIGHTS_LIST)
public class RoomUsersWithRightsParser extends PacketParser<RoomUsersWithRightsMessageEvent> {
@Override
    public RoomUsersWithRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUsersWithRightsMessageEvent();
    }
}
