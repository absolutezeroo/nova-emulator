package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomBannedUsersMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RoomBannedUsers packet from client.
 */
@ParsesPacket(Incoming.ROOM_BAN_LIST)
public class RoomBannedUsersParser extends PacketParser<RoomBannedUsersMessageEvent> {
@Override
    public RoomBannedUsersMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomBannedUsersMessageEvent();
    }
}
