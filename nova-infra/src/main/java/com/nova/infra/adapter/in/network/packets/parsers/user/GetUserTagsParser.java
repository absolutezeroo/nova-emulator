package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.GetUserTagsMessageEvent;

/**
 * Parses GetUserTags packet from client.
 */
public class GetUserTagsParser extends PacketParser<GetUserTagsMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.USER_TAGS;
    }

    @Override
    public GetUserTagsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserTagsMessageEvent();
    }
}
