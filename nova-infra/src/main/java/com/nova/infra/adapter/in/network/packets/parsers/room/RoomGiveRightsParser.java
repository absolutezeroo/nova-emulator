package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomGiveRightsMessageEvent;

/**
 * Parses RoomGiveRights packet from client.
 */
public class RoomGiveRightsParser extends PacketParser<RoomGiveRightsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_RIGHTS_GIVE;
    }

    @Override
    public RoomGiveRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomGiveRightsMessageEvent();
    }
}
