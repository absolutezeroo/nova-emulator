package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetRoomEntryTileMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRoomEntryTile packet from client.
 */
@ParsesPacket(Incoming.GET_ROOM_ENTRY_TILE)
public class GetRoomEntryTileParser extends PacketParser<GetRoomEntryTileMessageEvent> {
@Override
    public GetRoomEntryTileMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomEntryTileMessageEvent();
    }
}
