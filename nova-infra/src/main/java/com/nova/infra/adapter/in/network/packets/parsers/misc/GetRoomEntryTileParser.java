package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetRoomEntryTileMessageEvent;

/**
 * Parses GetRoomEntryTile packet from client.
 */
public class GetRoomEntryTileParser extends PacketParser<GetRoomEntryTileMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_ROOM_ENTRY_TILE;
    }

    @Override
    public GetRoomEntryTileMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomEntryTileMessageEvent();
    }
}
