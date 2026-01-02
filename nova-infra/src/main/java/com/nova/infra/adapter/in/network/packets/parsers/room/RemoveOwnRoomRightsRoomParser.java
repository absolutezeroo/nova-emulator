package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.RemoveOwnRoomRightsRoomMessageEvent;

/**
 * Parses RemoveOwnRoomRightsRoom packet from client.
 */
public class RemoveOwnRoomRightsRoomParser extends PacketParser<RemoveOwnRoomRightsRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_RIGHTS_REMOVE_OWN;
    }

    @Override
    public RemoveOwnRoomRightsRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new RemoveOwnRoomRightsRoomMessageEvent();
    }
}
