package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RoomTakeRightsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

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
