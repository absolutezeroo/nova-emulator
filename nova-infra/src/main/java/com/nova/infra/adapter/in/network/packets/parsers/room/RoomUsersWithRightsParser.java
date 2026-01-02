package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomUsersWithRightsMessageEvent;

/**
 * Parses RoomUsersWithRights packet from client.
 */
public class RoomUsersWithRightsParser extends PacketParser<RoomUsersWithRightsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_RIGHTS_LIST;
    }

    @Override
    public RoomUsersWithRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomUsersWithRightsMessageEvent();
    }
}
