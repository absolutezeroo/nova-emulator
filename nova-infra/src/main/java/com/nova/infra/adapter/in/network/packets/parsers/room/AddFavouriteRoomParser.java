package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.AddFavouriteRoomMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

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
