package com.nova.infra.adapter.in.network.packets.parsers.room;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.room.UpdateRoomFilterMessageEvent;

/**
 * Parses UpdateRoomFilter packet from client.
 */
public class UpdateRoomFilterParser extends PacketParser<UpdateRoomFilterMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.ROOM_FILTER_WORDS_MODIFY;
    }

    @Override
    public UpdateRoomFilterMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new UpdateRoomFilterMessageEvent();
    }
}
