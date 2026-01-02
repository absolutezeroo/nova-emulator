package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetMessagesMessageEvent;

/**
 * Parses GetMessages packet from client.
 */
public class GetMessagesParser extends PacketParser<GetMessagesMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_FORUM_MESSAGES;
    }

    @Override
    public GetMessagesMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetMessagesMessageEvent();
    }
}
