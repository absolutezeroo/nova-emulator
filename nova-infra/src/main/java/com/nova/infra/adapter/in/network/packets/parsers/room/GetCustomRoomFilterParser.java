package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.GetCustomRoomFilterMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetCustomRoomFilter packet from client.
 */
@ParsesPacket(Incoming.ROOM_FILTER_WORDS)
public class GetCustomRoomFilterParser extends PacketParser<GetCustomRoomFilterMessageEvent> {
@Override
    public GetCustomRoomFilterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetCustomRoomFilterMessageEvent();
    }
}
