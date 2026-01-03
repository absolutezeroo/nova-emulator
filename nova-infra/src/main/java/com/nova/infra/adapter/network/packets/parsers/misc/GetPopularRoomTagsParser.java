package com.nova.infra.adapter.network.packets.parsers.misc;

import com.nova.infra.adapter.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.network.packets.headers.Incoming;
import com.nova.infra.adapter.network.codec.ClientMessage;
import com.nova.infra.adapter.network.packets.incoming.misc.GetPopularRoomTagsMessageEvent;
import com.nova.infra.adapter.network.packets.annotations.ParsesPacket;

/**
 * Parses GetPopularRoomTags packet from client.
 */
@ParsesPacket(Incoming.GET_POPULAR_ROOM_TAGS)
public class GetPopularRoomTagsParser extends PacketParser<GetPopularRoomTagsMessageEvent> {
@Override
    public GetPopularRoomTagsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetPopularRoomTagsMessageEvent();
    }
}
