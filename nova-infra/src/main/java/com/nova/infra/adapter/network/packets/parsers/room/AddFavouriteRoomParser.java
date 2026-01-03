package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.AddFavouriteRoomMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses AddFavouriteRoom packet from client.
 */
@ParsesPacket(Incoming.ROOM_FAVORITE)
public class AddFavouriteRoomParser extends PacketParser<AddFavouriteRoomMessageEvent> {
@Override
    public AddFavouriteRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new AddFavouriteRoomMessageEvent();
    }
}
