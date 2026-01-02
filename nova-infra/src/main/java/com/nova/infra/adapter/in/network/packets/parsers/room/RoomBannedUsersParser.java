package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomBannedUsersMessageEvent;

/**
 * Parses RoomBannedUsers packet from client.
 */
public class RoomBannedUsersParser extends PacketParser<RoomBannedUsersMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_BAN_LIST;
    }

    @Override
    public RoomBannedUsersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomBannedUsersMessageEvent();
    }
}
