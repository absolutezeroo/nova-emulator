package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RoomTakeRightsMessageEvent;

/**
 * Parses RoomTakeRights packet from client.
 */
public class RoomTakeRightsParser extends PacketParser<RoomTakeRightsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_RIGHTS_REMOVE;
    }

    @Override
    public RoomTakeRightsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RoomTakeRightsMessageEvent();
    }
}
