package com.nova.infra.adapter.in.network.packets.parsers.moderation;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.moderation.GetUserChatlogMessageEvent;

/**
 * Parses GetUserChatlog packet from client.
 */
public class GetUserChatlogParser extends PacketParser<GetUserChatlogMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.MODTOOL_REQUEST_USER_CHATLOG;
    }

    @Override
    public GetUserChatlogMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetUserChatlogMessageEvent();
    }
}
