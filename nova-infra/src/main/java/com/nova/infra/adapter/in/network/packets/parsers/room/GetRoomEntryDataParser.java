package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.GetRoomEntryDataMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetRoomEntryData packet from client.
 */
@ParsesPacket(Incoming.ROOM_MODEL)
public class GetRoomEntryDataParser extends PacketParser<GetRoomEntryDataMessageEvent> {
@Override
    public GetRoomEntryDataMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetRoomEntryDataMessageEvent();
    }
}
