package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.DeleteFavouriteRoomMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses DeleteFavouriteRoom packet from client.
 */
@ParsesPacket(Incoming.ROOM_FAVORITE_REMOVE)
public class DeleteFavouriteRoomParser extends PacketParser<DeleteFavouriteRoomMessageEvent> {
@Override
    public DeleteFavouriteRoomMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new DeleteFavouriteRoomMessageEvent();
    }
}
