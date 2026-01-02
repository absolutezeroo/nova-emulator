package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetPopularRoomTagsMessageEvent;

/**
 * Parses GetPopularRoomTags packet from client.
 */
public class GetPopularRoomTagsParser extends PacketParser<GetPopularRoomTagsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_POPULAR_ROOM_TAGS;
    }

    @Override
    public GetPopularRoomTagsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetPopularRoomTagsMessageEvent();
    }
}
