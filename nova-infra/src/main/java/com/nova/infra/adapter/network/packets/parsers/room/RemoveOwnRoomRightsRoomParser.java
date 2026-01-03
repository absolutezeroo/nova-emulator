package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.RemoveOwnRoomRightsRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses RemoveOwnRoomRightsRoom packet from client.
 */
@ParsesPacket(Incoming.ROOM_RIGHTS_REMOVE_OWN)
public class RemoveOwnRoomRightsRoomParser extends PacketParser<RemoveOwnRoomRightsRoomMessageEvent> {
@Override
    public RemoveOwnRoomRightsRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveOwnRoomRightsRoomMessageEvent();
    }
}
