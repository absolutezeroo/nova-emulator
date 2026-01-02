package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.GetRoomEntryDataMessageEvent;

/**
 * Parses GetRoomEntryData packet from client.
 */
public class GetRoomEntryDataParser extends PacketParser<GetRoomEntryDataMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_MODEL;
    }

    @Override
    public GetRoomEntryDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomEntryDataMessageEvent();
    }
}
