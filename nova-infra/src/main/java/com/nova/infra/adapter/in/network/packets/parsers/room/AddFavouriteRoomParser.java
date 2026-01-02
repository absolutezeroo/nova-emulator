package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.AddFavouriteRoomMessageEvent;

/**
 * Parses AddFavouriteRoom packet from client.
 */
public class AddFavouriteRoomParser extends PacketParser<AddFavouriteRoomMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_FAVORITE;
    }

    @Override
    public AddFavouriteRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AddFavouriteRoomMessageEvent();
    }
}
