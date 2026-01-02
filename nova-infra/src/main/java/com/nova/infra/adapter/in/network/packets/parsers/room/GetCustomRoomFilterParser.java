package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.GetCustomRoomFilterMessageEvent;

/**
 * Parses GetCustomRoomFilter packet from client.
 */
public class GetCustomRoomFilterParser extends PacketParser<GetCustomRoomFilterMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_FILTER_WORDS;
    }

    @Override
    public GetCustomRoomFilterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCustomRoomFilterMessageEvent();
    }
}
