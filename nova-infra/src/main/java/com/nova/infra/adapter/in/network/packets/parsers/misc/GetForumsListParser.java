package com.nova.infra.adapter.in.network.packets.parsers.misc;

import com.nova.infra.adapter.in.network.packets.parsers.PacketParser;
import com.nova.infra.adapter.in.network.packets.headers.Incoming;
import com.nova.infra.adapter.in.network.codec.ClientMessage;
import com.nova.infra.adapter.in.network.packets.incoming.misc.GetForumsListMessageEvent;

/**
 * Parses GetForumsList packet from client.
 */
public class GetForumsListParser extends PacketParser<GetForumsListMessageEvent> {

    @Override
    public int getHeaderId() {
        return Incoming.GET_FORUMS_LIST;
    }

    @Override
    public GetForumsListMessageEvent parse(ClientMessage message) {
        // No fields to parse
        return new GetForumsListMessageEvent();
    }
}
