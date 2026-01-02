package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.DeleteFavouriteRoomMessageEvent;

/**
 * Parses DeleteFavouriteRoom packet from client.
 */
public class DeleteFavouriteRoomParser extends PacketParser<DeleteFavouriteRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_FAVORITE_REMOVE;
    }

    @Override
    public DeleteFavouriteRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DeleteFavouriteRoomMessageEvent();
    }
}
