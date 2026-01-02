package com.nova.infra.adapter.in.network.packets.parsers.user;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.user.GetUserTagsMessageEvent;
import com.nova.infra.adapter.in.network.packets.annotations.ParsesPacket;

/**
 * Parses GetUserTags packet from client.
 */
@ParsesPacket(Incoming.USER_TAGS)
public class GetUserTagsParser extends PacketParser<GetUserTagsMessageEvent> {
@Override
    public GetUserTagsMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserTagsMessageEvent();
    }
}
