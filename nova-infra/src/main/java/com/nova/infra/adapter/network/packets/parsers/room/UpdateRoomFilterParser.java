package com.nova.infra.adapter.network.packets.parsers.room;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.room.UpdateRoomFilterMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses UpdateRoomFilter packet from client.
 */
@ParsesPacket(Incoming.ROOM_FILTER_WORDS_MODIFY)
public class UpdateRoomFilterParser extends PacketParser<UpdateRoomFilterMessageEvent> {
@Override
    public UpdateRoomFilterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateRoomFilterMessageEvent();
    }
}
